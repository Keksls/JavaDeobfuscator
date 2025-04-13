/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.wakfu.client.console.command.HelpCommand;
import com.ankamagames.wakfu.client.console.command.NavigateToParentCommandSetCommand;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public final class aVn
extends aVl {
    private static final Logger c = Logger.getLogger(aVn.class);
    private static final String d = ";";
    private static final String e = "/";
    private static final String f = "!";
    private static final String g = ">";
    private static final Pattern h = Pattern.compile("^((/(\\w+))+/)|^(((\\w+)/)+)|^(/\\w+)");
    public static final int b = 0xFFFFFF;
    private static final aZw i = new aZw("[.]{2}", null, new NavigateToParentCommandSetCommand(), false);
    private static final aZw j = new aZw("/\\?", null, new HelpCommand(), false);
    private static final aVn k = new aVn();
    private final aZx l;
    private aZx m;
    private avt_0 n;
    private boolean o = true;
    private boolean p = true;
    private byte q = (byte)127;

    public aVn() {
        this.l = new aZx();
        this.l.a(i);
        this.l.a(j);
        this.m = new aZx();
    }

    public static aVn d() {
        return k;
    }

    public void a(avt_0 avt_02) {
        this.n = avt_02;
    }

    public boolean e() {
        return this.o;
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    public boolean f() {
        return this.p;
    }

    public void b(boolean bl) {
        this.p = bl;
    }

    public byte g() {
        return this.q;
    }

    public void a(byte by) {
        this.q = by;
    }

    public aZx h() {
        return this.l;
    }

    public void i() {
        if (this.m != null && this.m.c() != null) {
            this.a(this.m.c());
        }
    }

    public void a(aZx aZx2) {
        if (aZx2 != null && aZx2 != this.m) {
            this.m = aZx2;
            String string = this.k();
            for (aVp aVp2 : aVo.a().b()) {
                aVp2.f(string);
            }
        }
    }

    public boolean a(URL uRL) {
        aZx aZx2;
        if (this.m != null && (aZx2 = this.m.e()) != null) {
            return aZx2.a(uRL);
        }
        return false;
    }

    public aZx j() {
        return this.m;
    }

    public String k() {
        if (this.m != null) {
            return this.m.f() + g;
        }
        return "";
    }

    public void c(String string) {
        this.a(string, true);
    }

    public void a(String string, boolean bl) {
        if (bl) {
            this.b(string);
        }
        String[] stringArray = null;
        stringArray = this.e() ? string.split(d) : new String[]{string};
        for (String string2 : stringArray) {
            Object object;
            Object object2;
            Object object3;
            Object object4;
            string2 = string2.trim();
            aZx aZx2 = null;
            if (this.f() && string2.startsWith(f)) {
                string2 = string2.substring(1);
                aZx2 = this.m;
            }
            if (this.f() && ((Matcher)(object4 = h.matcher(string2))).find()) {
                object3 = ((Matcher)object4).group();
                boolean bl2 = ((String)object3).startsWith(e);
                if (bl2) {
                    object2 = ((String)object3).substring(1).split(e);
                    object = this.m.e();
                } else {
                    object2 = ((String)object3).split(e);
                    object = this.m;
                }
                if (((String[])object2).length == 1 && !((String)object3).endsWith(e)) {
                    string2 = string2.substring(1);
                } else {
                    for (String string3 : object2) {
                        ArrayList<aZz> arrayList = ((aZx)object).b(string3, this.q);
                        if (arrayList.isEmpty()) {
                            aVo.a().d("Chemin " + string3 + " invalide");
                            break;
                        }
                        if (arrayList.size() == 1) {
                            aZz aZz2 = arrayList.get(0);
                            if (!(aZz2 instanceof aZx)) {
                                aVo.a().d("Chemin " + string3 + " invalide");
                                break;
                            }
                        } else {
                            aVo.a().d("Trop de possibilit\u00e9s");
                            break;
                        }
                        object = (aZx)arrayList.get(0);
                    }
                    string2 = string2.substring(((String)object3).length());
                }
                this.a((aZx)object);
            }
            object4 = new ArrayList();
            ((ArrayList)object4).addAll(this.m.b(string2, this.q));
            ((ArrayList)object4).addAll(this.l.b(string2, this.q));
            if (((ArrayList)object4).isEmpty()) {
                if (this.n != null) {
                    object3 = new ArrayList<String>();
                    ((ArrayList)object3).add(string2);
                    this.n.a(null, (ArrayList<String>)object3);
                } else {
                    aVo.a().d("Commande '" + string2 + "' invalide");
                }
            } else {
                object3 = ((ArrayList)object4).iterator();
                while (object3.hasNext()) {
                    aZz aZz3 = (aZz)object3.next();
                    object = aZz3.a();
                    object2 = aZz3.k();
                    Matcher matcher = ((Pattern)object2).matcher(string2);
                    if (matcher.matches()) {
                        matcher.reset();
                        ArrayList<String> arrayList = new ArrayList<String>();
                        while (matcher.find()) {
                            for (int k = 0; k <= matcher.groupCount(); ++k) {
                                arrayList.add(matcher.group(k));
                            }
                        }
                        try {
                            object.a(aZz3, arrayList);
                        }
                        catch (Exception exception) {
                            aVo.a().d("Exception dans l'ex\u00e9cution de la commande \u00e0 la ligne : " + string2);
                            c.error((Object)("Exception dans l'ex\u00e9cution de la commande \u00e0 la ligne : " + string2), (Throwable)exception);
                        }
                    } else if (((Pattern)object2).pattern().length() != 0) {
                        aVo.a().d("Les param\u00e8tres de commande ne correspondent pas !");
                        aUh.a("error.chat.malformedCommand", new Object[0]);
                    }
                    if (object.a()) continue;
                    break;
                }
            }
            if (aZx2 == null) continue;
            this.a(aZx2);
        }
    }
}

