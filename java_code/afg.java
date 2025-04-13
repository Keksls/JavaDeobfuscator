/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

public class afg {
    private static final Logger b = Logger.getLogger(afg.class);
    private static final afg c = new afg();
    private static final long d = 375L;
    private String e;
    private final TIntHashSet f = new TIntHashSet();
    final aep_0 g = new aep_0();

    private afg() {
    }

    public static afg a() {
        return c;
    }

    public void b() {
        this.g.b();
        this.f.clear();
    }

    public String c() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public boolean a(int[] nArray) {
        return this.f.addAll(nArray);
    }

    public boolean a(int n) {
        return this.f.add(n);
    }

    public void a(long l) {
        assert (this.e != null) : "PaperMapManager : Path undefined";
        String string = String.format(this.e, l < 0L ? 375L : l);
        try {
            URL uRL = arl_1.c(string);
            this.g.a(arf_1.a(new BufferedInputStream(uRL.openStream())));
        }
        catch (MalformedURLException malformedURLException) {
            b.warn((Object)("Problem during PaperMapManager Load : invalid URL " + string));
        }
        catch (IOException iOException) {
            b.warn((Object)"Exception during PaperMapManager Load : ", (Throwable)iOException);
        }
    }

    public TIntHashSet b(int n) {
        return this.g.a(n);
    }

    public TIntArrayList d() {
        TIntArrayList tIntArrayList = new TIntArrayList();
        this.a(new afh(this, tIntArrayList));
        return tIntArrayList;
    }

    public void a(afl afl2) {
        if (this.f == null) {
            return;
        }
        if (!this.f.isEmpty()) {
            this.f.forEach((TIntProcedure)new afi(this, afl2));
        }
    }

    public void a(afk afk2) {
        if (this.f == null) {
            return;
        }
        if (!this.f.isEmpty()) {
            this.f.forEach((TIntProcedure)new afj(this, afk2));
        }
    }
}

