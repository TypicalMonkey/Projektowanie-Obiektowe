using Microsoft.AspNetCore.Mvc;
using NHibernate;
using zad7.Models;
using System.Collections.Generic;

namespace zad7.Controllers
{
    public class ProductController : Controller
    {
        private readonly NHibernate.ISession _session;

        public ProductController(NHibernate.ISession session)
        {
            _session = session;
        }

        [HttpGet]
        public IActionResult Index()
        {
            IList<Product> products;
            using (var transaction = _session.BeginTransaction())
            {
                products = _session.Query<Product>().ToList();
                transaction.Commit();
            }
            return View(products);
        }

        [HttpGet]
        [Route("api/product/all")]
        public IActionResult GetAll()
        {
            IList<Product> products;
            using (var transaction = _session.BeginTransaction())
            {
                products = _session.Query<Product>().ToList();
                transaction.Commit();
            }
            return Ok(products);
        }
    }
}
