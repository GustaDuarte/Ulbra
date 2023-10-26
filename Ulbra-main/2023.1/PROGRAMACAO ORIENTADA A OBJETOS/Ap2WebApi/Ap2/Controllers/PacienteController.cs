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
    public class PacienteController : ControllerBase
    {
        private readonly IPacienteRepository repositiory;

        public PacienteController()
        {
            this.repositiory = new PacienteRepository();
        }

        [HttpGet]
        public IEnumerable<Paciente>Get()
        {
            return repositiory.GetAll();
        }
        
        [HttpGet("{id}")]
        public Paciente Get(int id)
        {
            return repositiory.GetById(id);
        }

        [HttpPost]
        public IActionResult Post([FromBody]Paciente item)
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
                message = "Paciente excluída com sucesso"
            });
        }

        [HttpPut]
        public IActionResult Put([FromBody]Paciente item)
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