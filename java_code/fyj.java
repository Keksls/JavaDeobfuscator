/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fyj
implements fzd<Object> {
    protected static final Logger a = Logger.getLogger(fyj.class);
    public static final Class<Object> b = Object.class;

    public String a(String string) {
        return this.a(b, string);
    }

    public String a(Class<? extends Object> clazz, String string) {
        return string;
    }

    @Override
    public Object b(Class<?> clazz, String string, fyy_0 fyy_02) {
        return string;
    }

    @Override
    public Class<Object> a() {
        return b;
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public String a(fkr_2 fkr_22, fyw_0 fyw_02, Class<? extends Object> clazz, String string, fya_0 fya_02) {
        return "\"" + string + "\"";
    }

    @Override
    public /* synthetic */ Object b(String string) {
        return this.a(string);
    }

    @Override
    public /* synthetic */ Object b(Class clazz, String string) {
        return this.a(clazz, string);
    }
}

