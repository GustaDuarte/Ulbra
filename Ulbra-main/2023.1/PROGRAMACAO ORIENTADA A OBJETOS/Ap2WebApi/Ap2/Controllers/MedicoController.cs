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
    public class MedicoController : ControllerBase
    {
        private readonly IMedicoRepository repositiory;

        public MedicoController()
        {
            this.repositiory = new MedicoRepository();
        }

        [HttpGet]
        public IEnumerable<Medico>Get()
        {
            return repositiory.GetAll();
        }
        
        [HttpGet("{id}")]
        public Medico Get(int id)
        {
            return repositiory.GetById(id);
        }

        [HttpPost]
        public IActionResult Post([FromBody]Medico item)
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
                message = "Medico excluída com sucesso"
            });
        }

        [HttpPut]
        public IActionResult Put([FromBody]Medico item)
        {
            repositiory.Update(item);
            return Ok( new {
                statusCode=200,
                message = item.Nome + " atualizado com sucesso",
                item
            });
        }
    }
}