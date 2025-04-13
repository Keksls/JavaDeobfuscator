/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class bOC
extends bOv {
    private blx_1 k = null;
    private static final Comparator<bpl_0> l = new bOD();
    private boolean m = false;

    public bOC(byte by) {
        super(fid.c, by);
    }

    private void a(ArrayList<bpl_0> arrayList, blx_1 blx_12) {
        blx_1 blx_13 = blx_12.aq();
        if (blx_13 == null) {
            return;
        }
        fig fig2 = blx_13.a(fid.b, (byte)0);
        if (fig2 == null) {
            return;
        }
        boq_0 boq_02 = (boq_0)fig2.e((short)0);
        boq_0 boq_03 = (boq_0)fig2.e((short)1);
        Iterator<bpl_0> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            bpl_0 bpl_02 = iterator.next();
            short s2 = fig2.b(bpl_02.a());
            if (s2 == -1 || ((bph_0)bpl_02.r()).w()) continue;
            boq_0 boq_04 = boq_0.a(fie.a, bpl_02.a(), bpl_02.aT_(), bpl_02.n());
            if (this.a(boq_04, s2)) {
                iterator.remove();
                continue;
            }
            boq_04.release();
        }
    }

    public void a(blx_1 blx_12) {
        if (!this.m && blx_12 == this.k) {
            return;
        }
        this.m = false;
        this.i();
        this.k = blx_12;
        ArrayList<bpl_0> arrayList = new ArrayList<bpl_0>();
        Iterable<bpl_0> iterable = blx_12.bh();
        if (iterable == null) {
            return;
        }
        for (bpl_0 bpl_02 : iterable) {
            arrayList.add(bpl_02);
        }
        this.a(arrayList, blx_12);
        for (bpl_0 bpl_02 : arrayList) {
            if (((bph_0)bpl_02.r()).w()) continue;
            boq_0 boq_02 = boq_0.a(fie.a, bpl_02.a(), bpl_02.aT_(), bpl_02.n());
            if (this.a(((bph_0)bpl_02.r()).F())) {
                this.a(boq_02, ((bph_0)bpl_02.r()).F());
                continue;
            }
            short s2 = this.b();
            this.a(boq_02, s2);
        }
    }

    public void s() {
        this.m = true;
    }
}

