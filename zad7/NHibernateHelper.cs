using FluentNHibernate.Cfg;
using FluentNHibernate.Cfg.Db;
using NHibernate;
using zad7.Models; 

namespace zad7
{
    public static class NHibernateHelper
    {
        public static NHibernate.ISession OpenSession()
        {
            return Fluently.Configure()
                .Database(SQLiteConfiguration.Standard.InMemory)
                .Mappings(m => m.FluentMappings.AddFromAssemblyOf<Product>())
                .BuildSessionFactory()
                .OpenSession();
        }
    }
}
