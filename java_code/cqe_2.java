/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from cQe
 */
public class cqe_2
implements fyq {
    private Stack<fyy_0> a = new Stack();
    private fya_0 b;

    @Override
    public fyo a(fya_0 fya_02, fyy_0 fyy_02) {
        this.b = fya_02;
        this.a.push(fyy_02);
        fyy_0 fyy_03 = this.a.peek();
        String string = "popupMenu";
        fts_0 fts_02 = new fts_0();
        fts_02.onCheckOut();
        fts_02.setElementMap(fyy_03);
        if (fyy_03 != null && string != null) {
            fyy_03.a(string, fts_02);
        }
        fts_02.setHotSpotPosition(frs_0.b);
        fts_02.onAttributesInitialized();
        fru_0 fru_02 = new fru_0();
        fru_02.onCheckOut();
        fru_02.setElementMap(fyy_03);
        fru_02.setStyle("popupMenu");
        fts_02.addBasicElement(fru_02);
        fru_02.onAttributesInitialized();
        fru_02.onChildrenAdded();
        fsM fsM2 = new fsM();
        fsM2.onCheckOut();
        fsM2.setElementMap(fyy_03);
        fsM2.setMaxWidth(250);
        fsM2.setStyle("popupMenu");
        fts_02.addBasicElement(fsM2);
        fsM2.onAttributesInitialized();
        fsM2.onChildrenAdded();
        ful ful2 = new ful();
        ful2.onCheckOut();
        ful2.setElementMap(fyy_03);
        ful2.setStyle("popupMenu");
        fts_02.addBasicElement(ful2);
        ful2.onAttributesInitialized();
        ful2.onChildrenAdded();
        fts_02.onChildrenAdded();
        return fts_02;
    }
}

