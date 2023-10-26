using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Ap2.Domain.Interfaces
{
    public interface IBaseRepository<Entity> where Entity : class
    {
        IList<Entity> GetAll();
        Entity GetById(int entityId);
        void Save(Entity entity);
        void Delete(int entityId);
        void Update(Entity entity);
  
    }
}