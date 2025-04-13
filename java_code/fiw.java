/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteIntIterator
 *  gnu.trove.iterator.TIntIntIterator
 *  gnu.trove.iterator.TLongIntIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TLongIntHashMap
 */
import gnu.trove.iterator.TByteIntIterator;
import gnu.trove.iterator.TIntIntIterator;
import gnu.trove.iterator.TLongIntIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TLongIntHashMap;
import java.nio.ByteBuffer;

final class fiw {
    fiw() {
    }

    static byte[] a(fia_0 fia_02) {
        abx_2 abx_22 = new abx_2();
        fiw.a(abx_22, fia_02.b());
        fiw.a(abx_22, fia_02.c());
        fiw.a(abx_22, fia_02.d());
        fiw.a(abx_22, fia_02.e());
        return abx_22.c();
    }

    static void a(ByteBuffer byteBuffer, fia_0 fia_02) {
        fiw.b(byteBuffer, fia_02);
        fiw.c(byteBuffer, fia_02);
        fiw.d(byteBuffer, fia_02);
        fiw.e(byteBuffer, fia_02);
    }

    private static void a(ByteBuffer byteBuffer, int n, TLongIntHashMap tLongIntHashMap) {
        tLongIntHashMap.clear();
        for (int k = n; k > 0; --k) {
            tLongIntHashMap.put(byteBuffer.getLong(), byteBuffer.getInt());
        }
    }

    private static void a(ByteBuffer byteBuffer, int n, TIntIntHashMap tIntIntHashMap) {
        tIntIntHashMap.clear();
        for (int k = n; k > 0; --k) {
            tIntIntHashMap.put(byteBuffer.getInt(), byteBuffer.getInt());
        }
    }

    private static void a(ByteBuffer byteBuffer, int n, TByteIntHashMap tByteIntHashMap) {
        tByteIntHashMap.clear();
        for (int k = n; k > 0; --k) {
            tByteIntHashMap.put(byteBuffer.get(), byteBuffer.getInt());
        }
    }

    private static void a(abx_2 abx_22, TIntIntHashMap tIntIntHashMap) {
        if (tIntIntHashMap == null) {
            abx_22.a((byte)0);
        } else {
            abx_22.a((byte)tIntIntHashMap.size());
            TIntIntIterator tIntIntIterator = tIntIntHashMap.iterator();
            while (tIntIntIterator.hasNext()) {
                tIntIntIterator.advance();
                abx_22.a(tIntIntIterator.key());
                abx_22.a(tIntIntIterator.value());
            }
        }
    }

    private static void a(abx_2 abx_22, TLongIntHashMap tLongIntHashMap) {
        if (tLongIntHashMap == null) {
            abx_22.a((byte)0);
        } else {
            abx_22.a((byte)tLongIntHashMap.size());
            TLongIntIterator tLongIntIterator = tLongIntHashMap.iterator();
            while (tLongIntIterator.hasNext()) {
                tLongIntIterator.advance();
                abx_22.a(tLongIntIterator.key());
                abx_22.a(tLongIntIterator.value());
            }
        }
    }

    private static void a(abx_2 abx_22, TByteIntHashMap tByteIntHashMap) {
        if (tByteIntHashMap == null) {
            abx_22.a((byte)0);
            return;
        }
        abx_22.a((byte)tByteIntHashMap.size());
        TByteIntIterator tByteIntIterator = tByteIntHashMap.iterator();
        while (tByteIntIterator.hasNext()) {
            tByteIntIterator.advance();
            abx_22.a(tByteIntIterator.key());
            abx_22.a(tByteIntIterator.value());
        }
    }

    private static void b(ByteBuffer byteBuffer, fia_0 fia_02) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fia_02.g();
        TIntIntHashMap tIntIntHashMap = fia_02.b();
        fiw.a(byteBuffer, n, tIntIntHashMap);
    }

    private static void c(ByteBuffer byteBuffer, fia_0 fia_02) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fia_02.h();
        TIntIntHashMap tIntIntHashMap = fia_02.c();
        fiw.a(byteBuffer, n, tIntIntHashMap);
    }

    private static void d(ByteBuffer byteBuffer, fia_0 fia_02) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fia_02.i();
        TLongIntHashMap tLongIntHashMap = fia_02.d();
        fiw.a(byteBuffer, n, tLongIntHashMap);
    }

    private static void e(ByteBuffer byteBuffer, fia_0 fia_02) {
        int n = byteBuffer.get() & 0xFF;
        if (n <= 0) {
            return;
        }
        fia_02.j();
        fiw.a(byteBuffer, n, fia_02.e());
    }
}

