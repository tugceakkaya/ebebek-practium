public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    public Employee(String name, double salary, int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }



    public double tax(){


        if(salary<=1000){
            System.out.println("Maaşınız 1000 tl den az olduğu için vergi hesaplanamaz");
            return  salary;
        }
        else {
            double taxsalary;
            taxsalary=salary*0.3;
            return  taxsalary;
        }
    }

    public double bonus(){

        if(workHours<=40)
        {
            return salary;
        }
        else {
            int bonusWorkHours;
            int bonusSalary;
           bonusWorkHours= workHours-40;

           bonusSalary=bonusWorkHours*30;
           return bonusSalary;
        }
    }

    public double raiseSalary(){
       int historyYear=2021-hireYear;

       if(historyYear<10){
        double  zam=salary*0.05;
        return  zam;
       }
       else if (historyYear>9 || historyYear<20) {

           double zam=salary*0.10;
           return  zam;
       } else if (historyYear>19) {
           double zam=salary*0.15;
           return zam;
           
       }
       return 0;
    }

    public String toString() {

        System.out.println("İSMİNİZ"+""+name);
        System.out.println("Brüt maaşınız"+"" +salary);
        System.out.println("Haftalık calısma saatiniz"+""+workHours);
        System.out.println("Calisma süreniz"+"" +hireYear);

        System.out.println("Ödediğiniz vergi tutarı"+""+tax()+"TL");
        System.out.println("Alacağınız bonus para sayısı"+""+bonus() +"TL");

        System.out.println("Görev süresine göre alacağınız zam tutarı"+raiseSalary()+"");
        double toplamMaas=salary-tax()+bonus()+raiseSalary();

        double v = +salary - tax();
        double b = +salary - tax()+bonus();
        System.out.println("Maasdan vergi kesintisi olunca kalan tutar="+""+v);
        System.out.println("Maas, vergi kesintisi ve bonus tutarı"+""+b);

        System.out.println("Net maasiniz"+""+toplamMaas+"TL");
        return null;

    }
}
