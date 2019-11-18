
import de.unikassel.vs.asp.modelling.AspGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AspStringGenerationTest {

    @Test
    public void predicateStringTest() {
        String testString = "fly(X) :- bird(X), not -fly(X).";

        AspGenerator gen = new AspGenerator();

        gen.createRule().addHead().withPredicate("fly").withVariableAsRule("X")
                .addBody().withPredicate("bird").withVariableAsBody("X").withPredicate("not -fly").withVariableAsBody("X");

        Assertions.assertEquals(testString, gen.getAspProgram());
    }

    @Test
    public void factStringTest() {

        String testString = "eagle(eddy).\npenguin(tux).";

        AspGenerator gen = new AspGenerator();

        gen.createFact("eagle").withConstant("eddy");
        gen.createFact("penguin").withConstant("tux");

        Assertions.assertEquals(testString, gen.getAspProgram());
    }

}
