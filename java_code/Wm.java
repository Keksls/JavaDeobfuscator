/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.nio.ByteBuffer;
import java.util.List;

final class Wm {
    private final vz_0 a;

    Wm(vz_0 vz_02) {
        this.a = vz_02;
    }

    void a(Wg wg, ByteBuffer byteBuffer, int n, TShortObjectHashMap<List<vl_0>> tShortObjectHashMap) {
        for (int k = 0; k < n; ++k) {
            short s2 = byteBuffer.getShort();
            int n2 = byteBuffer.getInt();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = byteBuffer.getInt();
                byte[] byArray = new byte[n3];
                byteBuffer.get(byArray);
                try {
                    vl_0 vl_02 = vl_0.b(this.a, ByteBuffer.wrap(byArray));
                    wg.a(vl_02, s2, tShortObjectHashMap);
                    continue;
                }
                catch (Exception exception) {
                    Wk.a.error((Object)"Exception levee", (Throwable)exception);
                }
            }
        }
    }
}

