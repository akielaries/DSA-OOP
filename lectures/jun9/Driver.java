public class Driver
{
  public static void main(String[] args)
  {
    // creating a cat object, but not an animal object
    Cat c = new Cat();
    c.eat();
    c.travel();

/*
    Kangaroo k = new Kangaroo();
    k.eat();
    k.travel();

    MutantTurtle m = new MutantTurtle();
    m.eat();
    m.travel();
    System.out.println(m.getOoze());

    CuttleFish cf = new CuttleFish();
    cf.eat();
    cf.travel();

    CombatWombat cw = new CombatWombat();
    cw.eat();
    cw.travel();
    System.out.println(cw.getBoomerang());

    Gerbil g = new Gerbil();
    g.eat();
    g.travel();

    Axolotl axe = new Axolotl();
    axe.eat();
    axe.travel();

    HoneyBadger hb = new HoneyBadger();
    hb.eat();
    hb.travel();

    ViciousOstrich vo = new ViciousOstrich();
    vo.eat();
    vo.travel();

    */

    SushiArmadillo sushi = new SushiArmadillo();
    sushi.eat();
    sushi.travel();

    PlataTux prettyTux = new PlataTux();
    prettyTux.eat();
    prettyTux.travel();
  }
}
