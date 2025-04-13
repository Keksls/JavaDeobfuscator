/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.antlr.runtime.BaseRecognizer
 *  org.antlr.runtime.DFA
 */
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.DFA;

/*
 * Renamed from aYY
 */
public class ayy_0
extends DFA {
    final /* synthetic */ aYX a;

    public ayy_0(aYX aYX2, BaseRecognizer baseRecognizer) {
        this.a = aYX2;
        this.recognizer = baseRecognizer;
        this.decisionNumber = 93;
        this.eot = aYX.kW;
        this.eof = aYX.kX;
        this.min = aYX.kY;
        this.max = aYX.kZ;
        this.accept = aYX.la;
        this.special = aYX.lb;
        this.transition = aYX.lc;
    }

    public String getDescription() {
        return "258:1: FLOAT : ( NUMBER | NUMBER '.' ( NUMERAL )+ );";
    }
}

