/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataInputStream
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  org.apache.log4j.Logger
 */
package com.ankamagames.framework.graphics.engine.Anm2;

import com.ankamagames.framework.graphics.engine.Anm2.Anm$ObjectFactory;
import com.google.common.io.LittleEndianDataInputStream;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import org.apache.log4j.Logger;

public final class Anm
extends abh_1 {
    public static final int a = 128;
    public static final int b = 63;
    public static final Anm$ObjectFactory c = new Anm$ObjectFactory();
    private static final Logger d = Logger.getLogger(Anm.class);
    private final fr_0 e = new fr_0();
    private volatile ate_2 f = ate_2.a;
    private ArrayList<ats_2> g;
    private gq_0 h;
    private String i;
    private String j;
    private static final ExecutorService k = Executors.newFixedThreadPool(3, new ThreadFactoryBuilder().setNameFormat("Anm-Loader-%d").setThreadFactory((ThreadFactory)new atk_2()).build());
    private Future<?> l;
    private short m;
    private static final short n = 500;

    Anm() {
    }

    public boolean a() {
        return this.h != null && this.h.e();
    }

    public fl_0 b() {
        return this.e.a();
    }

    public fr_0 c() {
        return this.e;
    }

    public void a(boolean bl) {
        String string = this.i + "/" + this.j;
        this.a(string, bl);
    }

    public void a(String string, boolean bl) {
        this.j = gi_0.g(string);
        this.i = gi_0.h(string);
        if (bl) {
            this.h = gg_0.a(string);
            this.f = ate_2.b;
        } else {
            try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream(gg_0.c(string));){
                this.a(new en_1(littleEndianDataInputStream));
            }
        }
    }

    public void a(eg_1 eg_12) {
        ed_0.a(this.e, this.i, eg_12);
        this.f = ate_2.d;
    }

    public void d() {
        switch (this.f) {
            case b: {
                if (!this.h.d()) break;
                Object object = this.h.f();
                this.h = null;
                this.f = ate_2.c;
                this.l = k.submit(() -> this.a((byte[])object));
                break;
            }
            case c: {
                try {
                    if (!this.l.isDone()) break;
                    this.f = ate_2.d;
                }
                catch (Exception exception) {
                    d.error((Object)"Exception raised : ", (Throwable)exception);
                }
            }
            case d: {
                if (this.r() == 0L) {
                    this.f = ate_2.f;
                    break;
                }
                this.t();
                this.f = ate_2.e;
            }
            case e: {
                Object object = ayu_2.a().a(this.r());
                if (object != null && ((azk_2)object).s()) break;
                this.f = ate_2.f;
            }
        }
        if (this.f() && this.g != null) {
            for (int k = 0; k < this.g.size(); ++k) {
                this.g.get(k).run();
            }
            this.g = null;
        }
    }

    public String e() {
        return this.j;
    }

    public boolean f() {
        return this.f == ate_2.f;
    }

    public boolean g() {
        return this.e.a().f();
    }

    public int a(String string) {
        return this.e.b().a(string);
    }

    public float[] h() {
        return this.e.b().a();
    }

    @Override
    public void n_() {
        this.m = (short)500;
    }

    @Override
    public void m() {
        ays_2 ays_22;
        this.f = ate_2.a;
        if (this.e.a() != null && (ays_22 = ayu_2.a().a(this.e.c().b())) != null) {
            ays_22.u();
        }
        this.e.h();
        this.i = null;
        this.j = null;
        this.h = null;
        this.g = null;
    }

    private String s() {
        if (this.e.a().c()) {
            return this.i + "/Atlas/";
        }
        return this.i + "/Textures/";
    }

    private String c(String string) {
        return this.s() + string + ".png";
    }

    private void t() {
        if (this.o() == null) {
            return;
        }
        ayu_2 ayu_22 = ayu_2.a();
        String string = this.c(this.o());
        atf_2 atf_22 = atf_2.a();
        ays_2 ays_22 = ayu_22.a((aui_2)auj_1.a.a(), this.r(), string, atf_22.c(), atf_22.b());
        ays_22.k_();
    }

    @Override
    public void k_() {
        super.k_();
        this.m = (short)500;
    }

    public short j() {
        return this.m;
    }

    public void k() {
        if (this.aw() == 0 && this.m > Short.MIN_VALUE) {
            this.m = (short)(this.m - 1);
        }
    }

    public void a(ats_2 ats_22) {
        if (this.g == null) {
            this.g = new ArrayList(2);
        }
        this.g.add(ats_22);
    }

    public void b(ats_2 ats_22) {
        if (this.g != null) {
            this.g.remove(ats_22);
        }
    }

    public static int b(String string) {
        return atm_1.a(string).b();
    }

    public fo_0[] n() {
        return this.e.b().b();
    }

    public String o() {
        return this.e.c().a();
    }

    public fy_0 p() {
        return this.e.e();
    }

    public fp_0 q() {
        return this.e.b();
    }

    public long r() {
        return this.e.c().b();
    }

    public String toString() {
        return "Anm{m_path='" + this.i + "', m_fileName='" + this.j + "'}";
    }

    private /* synthetic */ void a(byte[] byArray) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
             LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)byteArrayInputStream);){
            this.a(new en_1(littleEndianDataInputStream));
        }
        catch (IOException iOException) {
            d.error((Object)("Exception while loading ANM " + this), (Throwable)iOException);
        }
    }
}

