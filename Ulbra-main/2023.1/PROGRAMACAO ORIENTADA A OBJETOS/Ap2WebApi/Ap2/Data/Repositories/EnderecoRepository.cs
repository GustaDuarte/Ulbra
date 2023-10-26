using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Ap2.Data.Context;
using Ap2.Domain.Interfaces;
using Microsoft.EntityFrameworkCore;

namespace Ap2
{
    public class EnderecoRepository : IEnderecoRepository
    {
        private readonly DataContext context ;

        public EnderecoRepository()
        {
            this.context = new DataContext();
        }
        public void Delete(int entityId)
        {
            var p = GetById(entityId);
            context.Enderecos.Remove(p);
            context.SaveChanges();
        }

        public IList<Endereco> GetAll()
        {
            return context.Enderecos.ToList();
        }

        public Endereco GetById(int entityId)
        {
            return context.Enderecos.Include(x=>x.Pessoas).SingleOrDefault(x=>x.Id == entityId);
        }

        public void Save(Endereco entity)
        {
            //entity.Pessoas = context.Pacientes.Find(entity.Pessoas.Id);
            // entity.Pessoas = context.Medicos.Find(entity.Pessoas.Id);
            context.Add(entity);
            context.SaveChanges();
        }

        public void Update(Endereco entity)
        {
            context.Enderecos.Update(entity);
            context.SaveChanges();
        }
    }
}