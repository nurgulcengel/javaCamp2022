using System;

namespace YoutubeDemo
{
    class Program
    {
        static void Main(string[] args)
        {

            CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
            customerManager.GiveCredit();



            //CreditManager creditManager = new CreditManager();
            //creditManager.Calculate();
            //creditManager.Save();

            //Customer customer = new Customer();
            //customer.Id = 1;
            //customer.Id = 1;
            //customer.City = "İstanbul";


            //CustomerManager customerManager = new CustomerManager(customer);

            //customerManager.Save();
            //customerManager.Delete();

            //Company company = new Company();
            //company.TaxNumber = "17658975";
            //company.CompanyName = "Trendyol";
            //company.Id = 123;

            //CustomerManager customerManager2 = new CustomerManager(new Person());

            //Customer customer1 = new Customer();
            //Customer customer2 = new Person();
            //Customer customer3 = new Company();


            //Person person = new Person();
            //person.FirstName = "Nurgül";
            //person.LastName = "Çengel";
            //person.NationalIdentity = "1234567890";


            Console.ReadLine();
        }
    }

    class CreditManager
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }

        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
    }

    interface ICreditManager
    {
        void Calculate();
        void Save();
    }

    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }

    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Ögretmen kredisi hesaplandı");
        }
        public override void Save()
        {
            base.Save();
        }
    }

    class MilitaryCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker kredisi hesaplandı");
        }
    }

    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Taşıt kredisi hesaplandı");
        }
    }


    class Customer
    {
        public Customer()
        {
            Console.WriteLine("Constructor çalıştı");
        }
        public int Id { get; set; }
        public string City { get; set; }
    }

    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }

    class Company : Customer
    {
        public string TaxNumber { get; set; }
        public string CompanyName { get; set; }
    }

    class CustomerManager
    {
        private Customer _customer;
        private ICreditManager _creditManager;


        public CustomerManager(Customer customer, ICreditManager creditManager)
        {
            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri kaydedildi ");
        }

        public void Delete()
        {
            Console.WriteLine("Müşteri silindi ");
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi veridi");
        }

    }
}