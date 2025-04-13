/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.set.hash.TIntHashSet
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.set.hash.TIntHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from cES
 */
public class ces_0
implements cej_0 {
    public static final byte a = 4;
    public static final Pattern b = Pattern.compile("[0-9]+\\s*(;\\s*([0-9]+)\\s*)*$");
    public static final Pattern c = Pattern.compile("(([0-9]+)\\s*[;]\\s*)|(([0-9]+)$)");
    private TIntHashSet d = new TIntHashSet();
    private static final int e = 233811181;

    public ces_0() {
    }

    public ces_0(String string) {
        this.d = ces_0.b(string);
    }

    public ces_0(@NotNull TIntHashSet tIntHashSet) {
        this.d = tIntHashSet;
    }

    public String a() {
        TIntIterator tIntIterator = this.d.iterator();
        boolean bl = true;
        StringBuilder stringBuilder = new StringBuilder();
        while (tIntIterator.hasNext()) {
            if (!bl) {
                stringBuilder.append(";");
            } else {
                bl = false;
            }
            stringBuilder.append(tIntIterator.next());
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean a(cer_0 cer_02) {
        if (cer_02.c() != 4) {
            return false;
        }
        cet_0 cet_02 = (cet_0)cer_02;
        return this.d.contains(cet_02.a());
    }

    @Override
    public void a(arf_1 arf_12) {
        int n = arf_12.c();
        if (n == 233811181) {
            int n2 = arf_12.a();
            for (int k = 0; k < n2; ++k) {
                this.d.add(arf_12.c());
            }
        } else {
            this.d.add(n);
        }
    }

    @Override
    public void a(gk_0 gk_02) {
        gk_02.a(233811181);
        gk_02.a((byte)this.d.size());
        TIntIterator tIntIterator = this.d.iterator();
        while (tIntIterator.hasNext()) {
            gk_02.a(tIntIterator.next());
        }
    }

    @Override
    public byte d() {
        return 4;
    }

    @Override
    public cej_0 e() {
        return new ces_0(this.d);
    }

    public static boolean a(String string) {
        if (string == null) {
            return false;
        }
        Matcher matcher = b.matcher(string);
        return matcher.matches();
    }

    public static TIntHashSet b(String string) {
        TIntHashSet tIntHashSet = new TIntHashSet();
        if (string == null) {
            return tIntHashSet;
        }
        Matcher matcher = b.matcher(string);
        if (!matcher.matches()) {
            return tIntHashSet;
        }
        Matcher matcher2 = c.matcher(string);
        matcher2.reset();
        while (matcher2.find()) {
            String string2 = matcher2.group(2);
            if (string2 == null) {
                string2 = matcher2.group(3);
            }
            int n = Co.c(string2);
            tIntHashSet.add(n);
        }
        return tIntHashSet;
    }

    public /* synthetic */ Object clone() {
        return this.e();
    }
}

