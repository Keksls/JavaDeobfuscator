/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import java.util.ArrayList;

/*
 * Renamed from awS
 */
public class aws_2
implements awr_2 {
    private final awr_2 a;
    private static final ArrayList<awt_2> b = new ArrayList();

    public aws_2(awr_2 awr_22) {
        this.a = awr_22;
    }

    public static boolean a(awt_2 awt_22) {
        return !b.contains(awt_22) && b.add(awt_22);
    }

    @Override
    public void a(VertexBufferPCT vertexBufferPCT, float[] fArray, int n) {
        for (int k = 0; k < b.size(); ++k) {
            awt_2 awt_22 = b.get(k);
            if (awt_22.a()) continue;
            awv_2.a().a(vertexBufferPCT, fArray, n);
            return;
        }
        this.a.a(vertexBufferPCT, fArray, n);
    }

    @Override
    public void a(float[] fArray) {
        for (int k = 0; k < b.size(); ++k) {
            awt_2 awt_22 = b.get(k);
            if (awt_22.a()) continue;
            awv_2.a().a(fArray);
            return;
        }
        this.a.a(fArray);
    }
}

