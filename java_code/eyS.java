/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.antlr.runtime.ANTLRStringStream
 *  org.antlr.runtime.CharStream
 *  org.antlr.runtime.CommonTokenStream
 *  org.antlr.runtime.RecognitionException
 *  org.antlr.runtime.TokenSource
 *  org.antlr.runtime.TokenStream
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.apache.log4j.Logger;

public final class eyS {
    private static final Logger a = Logger.getLogger(eyS.class);

    private eyS() {
    }

    public static ArrayList<aot_2> a(String string) {
        ArrayList<aot_2> arrayList;
        if (string == null || string.trim().length() == 0) {
            return null;
        }
        String string2 = string.replaceAll("[\r\n]", " ");
        ANTLRStringStream aNTLRStringStream = new ANTLRStringStream(string2);
        eyp_0 eyp_02 = new eyp_0((CharStream)aNTLRStringStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream((TokenSource)eyp_02);
        eyR eyR2 = new eyR((TokenStream)commonTokenStream);
        try {
            arrayList = eyR2.b();
        }
        catch (RecognitionException recognitionException) {
            throw new RuntimeException("Erreur de syntaxe dans le crit\u00e8re, \u00e0 la ligne " + recognitionException.line + " caract\u00e8re " + recognitionException.charPositionInLine + " sur le Token " + recognitionException.token.toString() + ".", recognitionException);
        }
        if (eyR2.getNumberOfSyntaxErrors() != 0) {
            throw new RuntimeException("Erreur de syntaxe dans le crit\u00e8re", new Exception());
        }
        return arrayList;
    }

    public static apb_2 b(String string) {
        ArrayList<aot_2> arrayList = eyS.a(string);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        aot_2 aot_22 = arrayList.get(arrayList.size() - 1);
        if (aot_22.t_() != aov_1.f) {
            a.error((Object)("On a un crit\u00e8re de type " + aot_22.t_().name() + " au lieu d'un bool\u00e9en"));
            return null;
        }
        return (apb_2)aot_22;
    }

    public static apc_2 c(String string) {
        ArrayList<aot_2> arrayList = eyS.a(string);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        apc_2 apc_22 = null;
        for (aot_2 aot_22 : arrayList) {
            if (aot_22 == null || aot_22.t_() != aov_1.c) continue;
            if (apc_22 == null) {
                apc_22 = (apc_2)aot_22;
                continue;
            }
            apc_22 = aos_1.a((aot_2)apc_22, aot_22);
        }
        return apc_22;
    }
}

