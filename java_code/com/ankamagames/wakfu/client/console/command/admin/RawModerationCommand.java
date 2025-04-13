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
package com.ankamagames.wakfu.client.console.command.admin;

import java.util.ArrayList;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.apache.log4j.Logger;

public class RawModerationCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(RawModerationCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aXj aXj2;
        if (arrayList == null || arrayList.size() < 1) {
            a.error((Object)"Commande vide.");
            return;
        }
        String string = arrayList.get(1);
        String[] stringArray = string.trim().split("[ ]+", 2);
        if (string.length() > 0) {
            stringArray[0] = stringArray[0].toLowerCase();
        }
        Object object2 = "";
        for (String string2 : stringArray) {
            object2 = (String)object2 + string2 + " ";
        }
        a.info((Object)("Ex\u00e9cution de la commande brute : " + (String)object2));
        aYX aYX2 = new aYX((CharStream)new ANTLRStringStream((String)object2 + "\n"));
        CommonTokenStream commonTokenStream = new CommonTokenStream((TokenSource)aYX2);
        aza_0 aza_02 = new aza_0((TokenStream)commonTokenStream);
        try {
            aXj2 = aza_02.aH();
        }
        catch (RecognitionException exception) {
            String string4 = "Erreur de syntaxe dans la commande (ligne " + exception.line + ", caract\u00e8re " + exception.charPositionInLine + ", token " + exception.token.toString() + ")";
            a.error((Object)string4);
            aVo.a().d(string4);
            return;
        }
        catch (aos_2 string5) {
            String string3 = "Erreur de syntaxe :" + string5;
            a.error((Object)string3);
            aVo.a().d(string3);
            return;
        }
        catch (Exception exception) {
            String string4 = "Commande incorrecte : " + exception;
            a.error((Object)string4);
            aVo.a().d(string4);
            return;
        }
        if (aXj2 != null && aXj2.a()) {
            aXj2.b();
        } else {
            String string5 = "Le parseur de commande n'a retourn\u00e9 aucun objet valide.";
            a.error((Object)"Le parseur de commande n'a retourn\u00e9 aucun objet valide.");
            aVo.a().d("Le parseur de commande n'a retourn\u00e9 aucun objet valide.");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

