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
    public class ConsultaController : ControllerBase
    {
        private readonly IConsultaRepository repositiory;

        public ConsultaController()
        {
            this.repositiory = new ConsultaRepository();
        }

        [HttpGet]
        public IEnumerable<Consulta>Get()
        {
            return repositiory.GetAll();
        }
        
        [HttpGet("{id}")]
        public Consulta Get(int id)
        {
            return repositiory.GetById(id);
        }

        [HttpPost]
        public IActionResult Post([FromBody]Consulta item)
        {
            repositiory.Save(item);
            return Ok( new {
                statusCode=200,
                message = "Agendada com sucesso",
                item
            });
        }

        [HttpDelete("{id}")]
        public IActionResult Delete(int id)
        {
            repositiory.Delete(id);
            return Ok( new {
                statusCode=200,
                message = "Consulta excluída com sucesso"
            });
        }

        [HttpPut]
        public IActionResult Put([FromBody]Consulta item)
        {
            repositiory.Update(item);
            return Ok( new {
                statusCode=200,
                message = item.Id + " atualizada com sucesso",
                item
            });
        }
    }
}