using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Ap2.Data.Context;
using Ap2.Domain.Interfaces;
using Microsoft.EntityFrameworkCore;

namespace Ap2
{
    public class PacienteRepository : IPacienteRepository
    {
        private readonly DataContext context ;

        public PacienteRepository()
        {
            this.context = new DataContext();
        }
        public void Delete(int entityId)
        {
             var p = GetById(entityId);
            context.Pacientes.Remove(p);
            context.SaveChanges();
        }

        public IList<Paciente> GetAll()
        {
            return context.Pacientes.ToList();
        }

        public Paciente GetById(int entityId)
        {
            return context.Pacientes.Include(x=>x.Endereco).SingleOrDefault(x=>x.Id == entityId);
        }

        public void Save(Paciente entity)
        {
            entity.Endereco = context.Enderecos.Find(entity.Endereco.Id);
            context.Add(entity);
            context.SaveChanges();
        }

        public void Update(Paciente entity)
        {
            context.Pacientes.Update(entity);
            context.SaveChanges();
        }
    }
}