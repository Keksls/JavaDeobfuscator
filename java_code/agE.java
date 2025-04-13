/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.LittleEndianDataInputStream
 *  com.google.common.io.LittleEndianDataOutputStream
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.google.common.io.LittleEndianDataInputStream;
import com.google.common.io.LittleEndianDataOutputStream;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class agE {
    private static final TIntObjectHashMap<agD> b = new TIntObjectHashMap(20000, 1.0f);

    private agE() {
    }

    public static void a(agD agD2) {
        assert (!b.containsKey(agD2.a())) : "Un \u00e9l\u00e9ment avec l'id " + agD2.a() + " existe d\u00e9j\u00e0";
        b.put(agD2.a(), (Object)agD2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(String string) {
        try (LittleEndianDataInputStream littleEndianDataInputStream = new LittleEndianDataInputStream((InputStream)new ByteArrayInputStream(gg_0.b(string)));){
            int n = littleEndianDataInputStream.readInt();
            for (int k = 0; k < n; ++k) {
                agE.a(new agD((DataInput)littleEndianDataInputStream));
            }
            b.trimToSize();
        }
    }

    public static void b(String string) {
        FileOutputStream fileOutputStream = gi_0.o(string);
        LittleEndianDataOutputStream littleEndianDataOutputStream = new LittleEndianDataOutputStream((OutputStream)fileOutputStream);
        littleEndianDataOutputStream.writeInt(b.size());
        TIntObjectIterator tIntObjectIterator = b.iterator();
        for (int k = b.size(); k > 0; --k) {
            tIntObjectIterator.advance();
            ((agD)tIntObjectIterator.value()).a((DataOutput)littleEndianDataOutputStream);
        }
        littleEndianDataOutputStream.close();
    }

    public static agD a(int n) {
        return (agD)b.get(n);
    }

    public static void a() {
        b.clear();
    }

    public static int b() {
        return b.size();
    }
}

