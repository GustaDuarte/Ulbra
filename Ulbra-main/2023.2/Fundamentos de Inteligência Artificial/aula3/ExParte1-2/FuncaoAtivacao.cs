using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ExParte1_2
{
    public abstract class FuncaoAtivacao
    {
        public abstract double Calcular(double x);
    }

    public class LR : FuncaoAtivacao
    {
        public override double Calcular(double x)
        {
            return x;
        }
    }

    public class FR : FuncaoAtivacao
    {
        public override double Calcular(double x)
        {
            return x >= 0 ? 1 : 0;
        }
    }

    public class FS : FuncaoAtivacao
    {
        public override double Calcular(double x)
        {
            return 1 / (1 + Math.Exp(-x));
        }
    }
}