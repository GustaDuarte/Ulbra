using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Ap2.Domain.Interfaces;
using Microsoft.AspNetCore.Mvc;

namespace Ap2.Controllers
{
    [ApiController]
    [Route("api/[controller]")]
    public class EnderecoController : ControllerBase
    {
        private readonly IEnderecoRepository repositiory;

        public EnderecoController()
        {
            this.repositiory = new EnderecoRepository();
        }

        [HttpGet]
        public IEnumerable<Endereco>Get()
        {
            return repositiory.GetAll();
        }
        
        [HttpGet("{id}")]
        public Endereco Get(int id)
        {
            return repositiory.GetById(id);
        }

        [HttpPost]
        public IActionResult Post([FromBody]Endereco item)
        {
            repositiory.Save(item);
            return Ok( new {
                statusCode=200,
                message = "Cadastrado com sucesso",
                item
            });
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            repositiory.Delete(id);
            return Ok( new {
                statusCode=200,
                message = "Endereço excluído com sucesso"
            });
        }
        [HttpPut]
        public IActionResult Put([FromBody]Endereco item)
        {
            repositiory.Update(item);
            return Ok( new {
                statusCode=200,
                message = item.Id + " atualizado com sucesso",
                item
            });
        }
    }
}