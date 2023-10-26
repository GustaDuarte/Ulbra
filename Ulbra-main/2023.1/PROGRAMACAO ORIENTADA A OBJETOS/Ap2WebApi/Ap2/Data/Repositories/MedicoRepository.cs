using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Ap2.Data.Context;
using Ap2.Domain.Interfaces;
using Microsoft.EntityFrameworkCore;

namespace Ap2
{
    public class MedicoRepository : IMedicoRepository
    {
        private readonly DataContext context ;

        public MedicoRepository()
        {
            this.context = new DataContext();
        }

        public void Delete(int entityId)
        {
             var p = GetById(entityId);
            context.Medicos.Remove(p);
            context.SaveChanges();
        }

        public IList<Medico> GetAll()
        {
            return context.Medicos.ToList();
        }

        public Medico GetById(int entityId)
        {
            return context.Medicos.Include(x=>x.Consultas).SingleOrDefault(x=>x.Id == entityId);
        }

        public void Save(Medico entity)
        {
            entity.Endereco = context.Enderecos.Find(entity.Endereco.Id);
            context.Add(entity);
            context.SaveChanges();
        }

        public void Update(Medico entity)
        {
            context.Medicos.Update(entity);
            context.SaveChanges();
        }
    }
}