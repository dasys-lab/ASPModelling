import de.unikassel.vs.asp_modelling.ASPGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class APSStringGenerationTest {

    @Test
    public void predicateStringTest(){
        String testString = "fly(X) :- bird(X), not -fly(X).";

        ASPGenerator gen = new ASPGenerator();

        gen.createRule().addHead().withPredicate("fly").withVariableAsRule("X")
                .addBody().withPredicate("bird").withVariableAsBody("X").withPredicate("not -fly").withVariableAsBody("X");

        Assertions.assertEquals(testString, gen.getASPProgram());
    }

    @Test
    public void factStringTest(){

        String testString = "eagle(eddy).\npenguin(tux).";

        ASPGenerator gen = new ASPGenerator();

        gen.createFact("eagle").withConstant("eddy");
        gen.createFact("penguin").withConstant("tux");

        Assertions.assertEquals(testString, gen.getASPProgram());
    }

}
