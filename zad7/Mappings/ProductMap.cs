using FluentNHibernate.Mapping;
using zad7.Models;

namespace zad7.Mappings
{
    public class ProductMap : ClassMap<Product>
    {
        public ProductMap()
        {
            Table("Products");
            Id(x => x.Id).GeneratedBy.Identity();
            Map(x => x.Name).Not.Nullable();
            Map(x => x.Price).Not.Nullable();
            Map(x => x.Description);
        }
    }
}
