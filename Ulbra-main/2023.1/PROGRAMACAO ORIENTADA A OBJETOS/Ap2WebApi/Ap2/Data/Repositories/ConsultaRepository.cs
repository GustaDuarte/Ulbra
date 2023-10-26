using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Ap2.Data.Context;
using Ap2.Domain.Interfaces;
using Microsoft.EntityFrameworkCore;

namespace Ap2
{
    public class ConsultaRepository : IConsultaRepository
    {
        private readonly DataContext context ;

        public ConsultaRepository()
        {
            this.context = new DataContext();
        }
        public void Delete(int entityId)
        {
            var p = GetById(entityId);
            context.Consultas.Remove(p);
            context.SaveChanges();
        }

        public IList<Consulta> GetAll()
        {
             return context.Consultas.ToList();
        }

        public Consulta GetById(int entityId)
        {
            return context.Consultas.Include(x=>x.Paciente).Include(x=>x.Medico).SingleOrDefault(x=>x.Id == entityId);
        }

        public void Save(Consulta entity)
        {
            entity.Paciente = context.Pacientes.Find(entity.Paciente.Id);
            entity.Medico = context.Medicos.Find(entity.Medico.Id);
            context.Add(entity);
            context.SaveChanges();
        }

        public void Update(Consulta entity)
        {
            entity.Paciente = context.Pacientes.Find(entity.Paciente.Id);
            entity.Medico = context.Medicos.Find(entity.Medico.Id);
            context.Consultas.Update(entity);
            context.SaveChanges();
        }
    }
}