class MobileBrand
{
static String name;
public static void main(String a[])
{
MobileBrand brand=new MobileBrand();
brand.name="Sony";
MobileBrand brand1=new MobileBrand();
brand1.name="vivo";
brand.brand();
System.out.println(brand.name);
System.out.println(brand1.name);
}
void brand()
{
System.out.println("Ready");
}
}


