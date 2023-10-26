using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Ap2;
using Microsoft.EntityFrameworkCore;

namespace Ap2.Data.Context
{
    public class DataContext : DbContext
    {
        protected string DbPath { get; }
        public DataContext()
        {
            string path = Directory.GetCurrentDirectory();
            DbPath = System.IO.Path.Join(path, "ap2.db");
        }

        protected override void OnConfiguring(DbContextOptionsBuilder options)
            => options.UseSqlite($"Data Source={DbPath}");

        

        public DbSet<Consulta> Consultas {get; set;}
        public DbSet<Endereco> Enderecos {get; set;}
        public DbSet<Medico> Medicos {get; set;}
        public DbSet<Paciente> Pacientes {get; set;}

    }
}