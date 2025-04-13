/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from blB
 */
public class blb_2
extends bil_2 {
    public static final Pattern k = Pattern.compile("\\[(([a-z]|[A-Z]|[0-9])+)\\]");
    public static final Pattern l = Pattern.compile("\\[b=([0-9]+)\\]");
    public static final Pattern m = Pattern.compile("\\[r=([0-9]+)\\]");
    private final int n;
    private final int o;

    public blb_2(int n, int n2) {
        this.o = n2;
        this.n = n;
    }

    @Override
    protected String a() {
        String string;
        bls_2 bls_22 = blc_2.a().b(this.n);
        blt_2 blt_22 = blc_2.a().c(this.n);
        bla_2 bla_22 = blt_22.a(this.o);
        long l = 0L;
        String string2 = bla_22.e();
        if (bls_22 != null && string2 != null && string2.length() > 0) {
            l = bls_22.a(string2);
        }
        if (l == 0L || bls_22.g()) {
            return blb_2.a(blt_22);
        }
        if (bls_22.a(bla_22) == 1 && (string = blb_2.a(bla_22, bls_22, blt_22)) != null) {
            return string;
        }
        return null;
    }

    @Override
    protected long b() {
        return -1L;
    }

    @Override
    protected boolean c() {
        bls_2 bls_22 = blc_2.a().b(this.n);
        blt_2 blt_22 = blc_2.a().c(this.n);
        bla_2 bla_22 = blt_22.a(this.o);
        if (bls_22 == null) {
            return true;
        }
        return bls_22.a(bla_22) == 2;
    }

    @Override
    protected boolean f() {
        return false;
    }

    protected static String a(blt_2 blt_22) {
        String string = blt_22.d();
        if (string != null && string.length() == 0) {
            return null;
        }
        return string;
    }

    public static String a(bla_2 bla_22, bls_2 bls_22, blt_2 blt_22) {
        Object object;
        String string = bla_22.a();
        if (string == null || string.length() == 0) {
            return null;
        }
        string = (String)ezq_2.a(string, ezs_2.d, blt_22.u());
        Matcher matcher = l.matcher(string);
        while (matcher.find()) {
            object = bae.h().a(7, (long)Co.c(matcher.group(1)), new Object[0]);
            string = matcher.replaceFirst((String)object);
            matcher = l.matcher(string);
        }
        matcher = m.matcher(string);
        while (matcher.find()) {
            object = bae.h().a(12, (long)Co.c(matcher.group(1)), new Object[0]);
            string = matcher.replaceFirst((String)object);
            matcher = m.matcher(string);
        }
        matcher = k.matcher(string);
        while (matcher.find()) {
            object = bls_22.a(matcher.group().substring(1, matcher.group().length() - 1));
            string = matcher.replaceFirst(((Long)object).toString());
            matcher = k.matcher(string);
        }
        return string;
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected boolean g() {
        return false;
    }

    @Override
    protected boolean h() {
        return false;
    }
}

