/*
 * Decompiled with CFR 0.152.
 */
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/*
 * Renamed from aCQ
 */
public class acq_1
extends DefaultTableColumnModel {
    protected final Vector a = new Vector();

    public void a(Object object, boolean bl) {
        int n = this.b(object, false);
        TableColumn tableColumn = this.a(n, false);
        this.a(tableColumn, bl);
    }

    public void a(TableColumn tableColumn, boolean bl) {
        if (!bl) {
            super.removeColumn(tableColumn);
        } else {
            int n = this.tableColumns.size();
            int n2 = this.a.size();
            int n3 = 0;
            for (int k = 0; k < n2; ++k) {
                TableColumn tableColumn2 = n3 < n ? (TableColumn)this.tableColumns.get(n3) : null;
                TableColumn tableColumn3 = (TableColumn)this.a.get(k);
                if (tableColumn3 == tableColumn) {
                    if (tableColumn2 != tableColumn) {
                        super.addColumn(tableColumn);
                        super.moveColumn(this.tableColumns.size() - 1, n3);
                    }
                    return;
                }
                if (tableColumn3 != tableColumn2) continue;
                ++n3;
            }
        }
    }

    public void a() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            TableColumn tableColumn;
            TableColumn tableColumn2 = k < this.tableColumns.size() ? (TableColumn)this.tableColumns.get(k) : null;
            if (tableColumn2 == (tableColumn = (TableColumn)this.a.get(k))) continue;
            super.addColumn(tableColumn);
            super.moveColumn(this.tableColumns.size() - 1, k);
        }
    }

    public TableColumn a(int n) {
        for (int k = 0; k < this.a.size(); ++k) {
            TableColumn tableColumn = (TableColumn)this.a.elementAt(k);
            if (tableColumn.getModelIndex() != n) continue;
            return tableColumn;
        }
        return null;
    }

    public boolean a(TableColumn tableColumn) {
        return this.tableColumns.indexOf(tableColumn) >= 0;
    }

    @Override
    public void addColumn(TableColumn tableColumn) {
        this.a.addElement(tableColumn);
        super.addColumn(tableColumn);
    }

    @Override
    public void removeColumn(TableColumn tableColumn) {
        int n = this.a.indexOf(tableColumn);
        if (n != -1) {
            this.a.removeElementAt(n);
        }
        super.removeColumn(tableColumn);
    }

    @Override
    public void moveColumn(int n, int n2) {
        if (n < 0 || n >= this.getColumnCount() || n2 < 0 || n2 >= this.getColumnCount()) {
            throw new IllegalArgumentException("moveColumn() - Index out of range");
        }
        TableColumn tableColumn = (TableColumn)this.tableColumns.get(n);
        TableColumn tableColumn2 = (TableColumn)this.tableColumns.get(n2);
        int n3 = this.a.indexOf(tableColumn);
        int n4 = this.a.indexOf(tableColumn2);
        if (n != n2) {
            this.a.removeElementAt(n3);
            this.a.insertElementAt(tableColumn, n4);
        }
        super.moveColumn(n, n2);
    }

    public int a(boolean bl) {
        Vector vector = bl ? this.tableColumns : this.a;
        return vector.size();
    }

    public Enumeration b(boolean bl) {
        Vector vector = bl ? this.tableColumns : this.a;
        return vector.elements();
    }

    public int b(Object object, boolean bl) {
        if (object == null) {
            throw new IllegalArgumentException("Identifier is null");
        }
        Vector vector = bl ? this.tableColumns : this.a;
        int n = vector.size();
        for (int k = 0; k < n; ++k) {
            TableColumn tableColumn = (TableColumn)vector.get(k);
            if (!object.equals(tableColumn.getIdentifier())) continue;
            return k;
        }
        throw new IllegalArgumentException("Identifier not found");
    }

    public TableColumn a(int n, boolean bl) {
        if (bl) {
            return (TableColumn)this.tableColumns.elementAt(n);
        }
        return (TableColumn)this.a.elementAt(n);
    }
}

