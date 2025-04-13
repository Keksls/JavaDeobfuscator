/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

public class agz {
    private static final short a = 2;
    private static final agy b = new agA();

    @Nullable
    public static apl_1 a(afe_0 afe_02, aff_1 aff_12, ut_0 ut_02, yy_0 yy_02, uq_0 uq_02) {
        if (aff_12 == null) {
            return null;
        }
        int n = afe_02.be();
        int n2 = afe_02.bf();
        short s2 = afe_02.d() != null ? afe_02.d().I() : afe_02.I();
        uq_02.b();
        uq_02.a(n, n2, s2);
        uq_02.a(ut_02);
        uq_02.a((int)afe_02.af(), afe_02.X(), afe_02.aU());
        yz_0.a(afe_02.af(), afe_02.X(), afe_02.aU());
        boolean bl = false;
        if (yy_02 == null) {
            yy_02 = new yy_0();
            bl = true;
        }
        uq_02.a(yy_02);
        int n3 = aff_12.d();
        int n4 = aff_12.e();
        short s3 = yz_0.b(n3, n4, aff_12.f());
        if (bl) {
            yz_0.a(n, n2, n3, n4, yy_02);
        }
        uq_02.b(n3, n4, s3);
        int n5 = uq_02.g();
        if (n5 == -1 || n5 == 0) {
            return null;
        }
        long[] lArray = (long[])uq_02.d().clone();
        if (lArray == null) {
            return null;
        }
        int[][] nArray = new int[n5][3];
        for (int k = 0; k < n5; ++k) {
            int n6 = n5 - 1 - k;
            nArray[k][0] = uq_0.a(lArray[n6]);
            nArray[k][1] = uq_0.b(lArray[n6]);
            nArray[k][2] = uq_0.c(lArray[n6]);
        }
        return new apl_1(nArray);
    }

    public static aff_1 a(acb_0 acb_02, int n, int n2, boolean bl) {
        return agz.a(acb_02, n, n2, bl, bl);
    }

    @Nullable
    public static aff_1 a(acb_0 acb_02, int n, int n2, boolean bl, boolean bl2) {
        Object object;
        ArrayList<aek_0> arrayList;
        if ((bl || bl2) && (arrayList = acb_02.b(n, n2)).size() != 0 && (object = (afv)arrayList.get(0)) != null && (bl && ((abu)object).X() == 0 || bl2 && ((abu)object).X() > 0)) {
            return ((abu)object).ap();
        }
        arrayList = acb_02.a((float)n, (float)n2, 0.0f, acj.b);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        object = ((DisplayedScreenElement)arrayList.get(0)).d();
        return new aff_1(((ScreenElement)object).d(), ((ScreenElement)object).e(), ((ScreenElement)object).c());
    }

    @Nullable
    public static ArrayList<aff_1> b(acb_0 acb_02, int n, int n2, boolean bl, boolean bl2) {
        return agz.a(acb_02, n, n2, bl, bl2, b);
    }

    @Nullable
    public static ArrayList<aff_1> a(acb_0 acb_02, int n, int n2, boolean bl, boolean bl2, agy agy2) {
        afv afv2;
        ArrayList<aek_0> arrayList;
        if ((bl || bl2) && !(arrayList = acb_02.b(n, n2)).isEmpty() && (afv2 = (afv)arrayList.get(0)) != null && (bl && afv2.X() == 0 || bl2 && afv2.X() > 0) && agy2.a(afv2)) {
            ArrayList<aff_1> arrayList2 = new ArrayList<aff_1>(1);
            arrayList2.add(afv2.ap());
            return arrayList2;
        }
        arrayList = acb_02.a((float)n, (float)n2, 0.0f, acj.b);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return agz.a(arrayList);
    }

    private static ArrayList<aff_1> a(ArrayList<DisplayedScreenElement> arrayList) {
        int n = arrayList.size();
        ArrayList<aff_1> arrayList2 = new ArrayList<aff_1>(n);
        for (int k = 0; k < n; ++k) {
            ScreenElement screenElement = arrayList.get(k).d();
            arrayList2.add(new aff_1(screenElement.d(), screenElement.e(), screenElement.c()));
        }
        return arrayList2;
    }
}

