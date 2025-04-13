/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class afr {
    private static final Logger a = Logger.getLogger(afr.class);
    private static final afr b = new afr();
    private String c;
    private final Map<Short, afp> d = new HashMap<Short, afp>();
    private final Multimap<Integer, afp> e = HashMultimap.create();
    private short f = 0;

    private afr() {
    }

    public static afr a() {
        return b;
    }

    public String b() {
        return this.c;
    }

    public void a(String string) {
        this.c = string;
    }

    public short c() {
        short s2 = this.f;
        this.f = (short)(s2 + 1);
        return s2;
    }

    public void d() {
        this.f();
        if (this.c == null) {
            return;
        }
        try {
            arf_1 arf_12 = arf_1.a(gg_0.b(this.c));
            this.a(arf_12);
            arf_12.close();
        }
        catch (IOException iOException) {
            a.error((Object)("Error while loading PlayList file : " + this.c), (Throwable)iOException);
        }
    }

    public void e() {
        if (this.c == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = gi_0.o(this.c);
            gk_0 gk_02 = new gk_0(fileOutputStream);
            this.a(gk_02);
            gk_02.d();
            ((OutputStream)fileOutputStream).close();
        }
        catch (IOException iOException) {
            a.error((Object)("Error while saving PlayList file : " + this.c), (Throwable)iOException);
        }
    }

    public void a(@NotNull arf_1 arf_12) {
        short s2 = arf_12.b();
        this.d.clear();
        this.e.clear();
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            afp afp2 = new afp();
            afp2.a(arf_12);
            this.a(afp2);
        }
    }

    public void a(@NotNull gk_0 gk_02) {
        gk_02.a((short)this.d.size());
        for (afp afp2 : this.d.values()) {
            afp2.a(gk_02);
        }
    }

    public final void a(afp afp2) {
        this.d.put(afp2.h(), afp2);
        this.e.put((Object)afp2.j(), (Object)afp2);
    }

    public afp a(short s2) {
        return this.d.get(s2);
    }

    public Collection<afp> a(int n) {
        return this.e.get((Object)n);
    }

    public void a(BiConsumer<Short, afp> biConsumer) {
        this.d.forEach(biConsumer);
    }

    public short b(afp afp2) {
        for (Map.Entry<Short, afp> entry : this.d.entrySet()) {
            if (!entry.getValue().a(afp2)) continue;
            return entry.getKey();
        }
        return -1;
    }

    public void f() {
        this.d.clear();
        this.e.clear();
    }
}

