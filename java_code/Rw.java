/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class Rw
extends rg_0 {
    private static final Pattern a = Pattern.compile("([a-zA-Z]+)=([^;]+);?");
    static final String[] b = new String[0];
    private static final Logger c = Logger.getLogger(rc_0.class);
    private int d;
    private int e;
    private final ArrayList<Rx> f = new ArrayList();
    private boolean g;

    @Override
    protected boolean a(String string) {
        try {
            Matcher matcher = a.matcher(string);
            while (matcher.find()) {
                String[] stringArray;
                String string2 = matcher.group(1);
                String string3 = matcher.group(2);
                if ("weight".equalsIgnoreCase(string2)) {
                    this.d = Co.c(string3);
                    continue;
                }
                if ("particleid".equalsIgnoreCase(string2)) {
                    this.e = Co.c(string3);
                    continue;
                }
                if (!"appearance".equalsIgnoreCase(string2) || (stringArray = string3.split(",")).length == 0) continue;
                if (stringArray.length == 1) {
                    this.f.add(new Rx(stringArray[0], null));
                    continue;
                }
                String[] stringArray2 = new String[stringArray.length - 1];
                System.arraycopy(stringArray, 1, stringArray2, 0, stringArray2.length);
                this.f.add(new Rx(stringArray[0], stringArray2));
            }
            return true;
        }
        catch (NumberFormatException numberFormatException) {
            c.error((Object)("Impossible d'initialiser un " + this.getClass().getName() + ", mauvaise saisi des param\u00e8tres  : " + string));
            return false;
        }
    }

    @Override
    public ri_0 a() {
        return ri_0.r;
    }

    public ArrayList<Rx> e() {
        return this.f;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }
}

