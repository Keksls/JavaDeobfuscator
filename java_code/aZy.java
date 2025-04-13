/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

class aZy
extends DefaultHandler {
    private static final String a = "commandList";
    private static final String b = "commandSet";
    private static final String c = "command";
    private static final String d = "name";
    private static final String e = "cmdPattern";
    private static final String f = "argsPattern";
    private static final String g = "allowNoArg";
    private static final String h = "class";
    private static final String i = "level";
    private static final String j = "autoCompletion";
    private final Stack<aZx> k = new Stack();

    public aZy(aZx aZx2) {
        this.k.add(aZx2);
    }

    @Override
    public void startElement(String string, String string2, String string3, Attributes attributes) {
        if (!string3.equals(a)) {
            boolean bl;
            String string4 = attributes.getValue(d);
            String string5 = attributes.getValue(e);
            String string6 = attributes.getValue(f);
            boolean bl2 = attributes.getValue(g) != null && Boolean.parseBoolean(attributes.getValue(g));
            String string7 = attributes.getValue(i);
            boolean bl3 = bl = attributes.getValue(j) != null && Boolean.parseBoolean(attributes.getValue(j));
            if (string5 == null || string5.length() == 0) {
                aZx.a.error((Object)("cmdPattern est invalide pour " + string4 + "!"));
            }
            if (string3.equals(b)) {
                aZx aZx2 = new aZx(string5, string6, bl2);
                if (string4 != null) {
                    aZx2.a(string4);
                }
                if (string7 != null) {
                    aZx2.a(Byte.valueOf(string7));
                }
                if (!this.k.isEmpty()) {
                    aZx aZx3 = (aZx)this.k.lastElement();
                    aZx2.a(aZx3);
                    aZx3.a((aZz)aZx2);
                }
                this.k.add(aZx2);
            } else if (string3.equals(c)) {
                String string8 = attributes.getValue(h);
                try {
                    avt_0 avt_02 = null;
                    try {
                        avt_02 = (avt_0)this.getClass().getClassLoader().loadClass(string8).newInstance();
                    }
                    catch (InstantiationException instantiationException) {
                        aZx.a.error((Object)instantiationException.getMessage());
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        aZx.a.error((Object)illegalAccessException.getMessage());
                    }
                    catch (ClassCastException classCastException) {
                        aZx.a.error((Object)classCastException.getMessage());
                    }
                    if (!this.k.isEmpty()) {
                        aZw aZw2 = new aZw(string5, string6, avt_02, bl2);
                        if (string4 != null) {
                            aZw2.a(string4);
                        }
                        if (string7 != null) {
                            aZw2.a(Byte.valueOf(string7));
                        }
                        aZw2.a(bl);
                        ((aZx)this.k.lastElement()).a(aZw2);
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    aZx.a.error((Object)"ClassNotFound", (Throwable)classNotFoundException);
                }
            }
        }
    }

    @Override
    public void endElement(String string, String string2, String string3) {
        if (string3.equals(b)) {
            this.k.pop();
        }
    }

    @Override
    public void endDocument() {
    }
}

