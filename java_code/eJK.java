/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TLongHash
 *  gnu.trove.set.hash.TLongHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.impl.hash.TLongHash;
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

final class eJK {
    private static final Logger a = Logger.getLogger(eJK.class);
    private final eJL b;

    eJK(eJL eJL2) {
        this.b = eJL2;
    }

    public byte[] a(boolean bl) {
        HashMap<sd_0, byte[]> hashMap = new HashMap<sd_0, byte[]>();
        HashMap<sd_0, byte[]> hashMap2 = new HashMap<sd_0, byte[]>();
        TLongHashSet tLongHashSet = new TLongHashSet();
        this.b(bl, hashMap2, tLongHashSet);
        this.a(bl, hashMap, tLongHashSet);
        return this.a(bl, hashMap, hashMap2);
    }

    private byte[] a(boolean bl, Map<sd_0, byte[]> map, Map<sd_0, byte[]> map2) {
        abx_2 abx_22 = new abx_2();
        int n = map2.size() + map.size();
        abx_22.a((short)n);
        this.a(map2, abx_22);
        this.a(map, abx_22);
        return this.a(bl, map, map2, abx_22);
    }

    private void a(boolean bl, Map<sd_0, byte[]> map, TLongHashSet tLongHashSet) {
        for (sd_0 sd_02 : this.b) {
            efi_0 efi_02;
            ejh_0 ejh_02 = (ejh_0)sd_02;
            boolean bl2 = ejh_02.bt_() == efc_0.b.a();
            if (bl2 || !this.a(bl, ejh_02) || eJK.a((TLongHash)tLongHashSet, efi_02 = (efi_0)ejh_02.k())) continue;
            byte[] byArray = ejh_02.aw();
            map.put(ejh_02, byArray);
        }
    }

    private void b(boolean bl, Map<sd_0, byte[]> map, TLongHashSet tLongHashSet) {
        for (sd_0 sd_02 : this.b) {
            ejh_0 ejh_02 = (ejh_0)sd_02;
            boolean bl2 = ejh_02.bt_() == efc_0.b.a();
            if (!bl2) continue;
            if (!ejh_02.bl() && !this.a(bl, ejh_02)) {
                tLongHashSet.add((long)((eja_0)ejh_02).aF().p());
                continue;
            }
            byte[] byArray = ejh_02.aw();
            map.put(ejh_02, byArray);
        }
    }

    private byte[] a(boolean bl, Map<sd_0, byte[]> map, Map<sd_0, byte[]> map2, abx_2 abx_22) {
        boolean bl2;
        int n = abx_22.a();
        boolean bl3 = bl2 = n >= 0 && n <= 50000;
        if (!bl2) {
            a.warn((Object)("RunningEffectManager size is greater than Short.MAX_VALUE, it's SO HEAVY ! Bytes size : " + n + ", effects qty : " + this.b.i()));
            this.a(bl, map, map2, n);
            return eJK.b();
        }
        return abx_22.c();
    }

    private static byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(2);
        byteBuffer.putShort((short)0);
        return byteBuffer.array();
    }

    private void a(boolean bl, Map<sd_0, byte[]> map, Map<sd_0, byte[]> map2, int n) {
        eJK.a(map2, map);
    }

    private static void a(Map<sd_0, byte[]> map, Map<sd_0, byte[]> map2) {
        eJK.a(map);
        eJK.a(map2);
    }

    private static void a(Map<sd_0, byte[]> map) {
        Object object = "Effects : ";
        for (Map.Entry<sd_0, byte[]> entry : map.entrySet()) {
            sd_0 sd_02 = entry.getKey();
            byte[] byArray = entry.getValue();
            object = (String)object + "e:" + sd_02.ag() + ", s:" + byArray.length + ";";
        }
        a.warn(object);
    }

    private void a(Map<sd_0, byte[]> map, abx_2 abx_22) {
        for (Map.Entry<sd_0, byte[]> entry : map.entrySet()) {
            sd_0 sd_02 = entry.getKey();
            abx_22.a(sd_02.bt_());
            abx_22.a((short)entry.getValue().length);
            abx_22.b(entry.getValue());
            if (this.b.e(sd_02.c())) {
                abx_22.a((int)Math.max(0L, this.b.d(sd_02.c()) - System.currentTimeMillis()));
                continue;
            }
            abx_22.a(0);
        }
    }

    private boolean a(boolean bl, ejh_0 ejh_02) {
        eja_0 eja_02;
        fie_0 fie_02;
        if (bl) {
            return !(ejh_02 instanceof eht_0) && !ejh_02.P();
        }
        if (this.b.m()) {
            return ejh_02.bl() || eJK.a(ejh_02);
        }
        if (ejh_02 instanceof eja_0 && (fie_02 = (eja_02 = (eja_0)ejh_02).aF()).s()) {
            return true;
        }
        return !ejh_02.bl() && !ejh_02.bo() && !ejh_02.bn() && !ejh_02.bt() && !ejh_02.bp() && !ejh_02.bq() && !ejh_02.br() && !ejh_02.bs();
    }

    private static boolean a(ejh_0 ejh_02) {
        if (ejh_02 instanceof eja_0) {
            return true;
        }
        efi_0 efi_02 = (efi_0)ejh_02.k();
        if (efi_02 == null) {
            return false;
        }
        return efi_02 instanceof fie_0;
    }

    private static boolean a(TLongHash tLongHash, Sm sm) {
        return sm != null && sm.G_() == 1 && tLongHash.contains((long)((fie_0)sm).p());
    }

    public byte[] a() {
        HashMap<sd_0, byte[]> hashMap = new HashMap<sd_0, byte[]>();
        HashMap<sd_0, byte[]> hashMap2 = new HashMap<sd_0, byte[]>();
        this.b(hashMap, hashMap2);
        return this.a(false, hashMap, hashMap2);
    }

    private void b(Map<sd_0, byte[]> map, Map<sd_0, byte[]> map2) {
        for (sd_0 sd_02 : this.b) {
            ejh_0 ejh_02 = (ejh_0)sd_02;
            boolean bl = ejh_02.bt_() == efc_0.b.a();
            byte[] byArray = ejh_02.aw();
            if (bl) {
                map2.put(ejh_02, byArray);
                continue;
            }
            map.put(ejh_02, byArray);
        }
    }
}

