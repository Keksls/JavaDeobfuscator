/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from dy
 */
public final class dy_1
extends GeneratedMessageV3.Builder<dy_1>
implements db_1 {
    private int a;
    private MapField<Integer, dv_2> b;
    private MapField<Integer, Integer> c;
    private boolean d;
    private boolean e;

    public static final Descriptors.Descriptor a() {
        return dn_1.q;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.x();
            }
            case 2: {
                return this.z();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.y();
            }
            case 2: {
                return this.A();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.r.ensureFieldAccessorsInitialized(dw_1.class, dy_1.class);
    }

    dy_1() {
        this.w();
    }

    dy_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.w();
    }

    private void w() {
        if (dw_1.r()) {
            // empty if block
        }
    }

    public dy_1 l() {
        super.clear();
        this.y().clear();
        this.A().clear();
        this.d = false;
        this.a &= 0xFFFFFFFB;
        this.e = false;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dn_1.q;
    }

    public dw_1 m() {
        return dw_1.o();
    }

    public dw_1 n() {
        dw_1 dw_12 = this.o();
        if (!dw_12.isInitialized()) {
            throw dy_1.newUninitializedMessageException((Message)dw_12);
        }
        return dw_12;
    }

    public dw_1 o() {
        dw_1 dw_12 = new dw_1(this);
        int n = this.a;
        int n2 = 0;
        dw_12.h = this.x();
        dw_12.h.makeImmutable();
        dw_12.i = this.z();
        dw_12.i.makeImmutable();
        if ((n & 4) == 4) {
            n2 |= 1;
        }
        dw_12.j = this.d;
        if ((n & 8) == 8) {
            n2 |= 2;
        }
        dw_12.k = this.e;
        dw_12.g = n2;
        this.onBuilt();
        return dw_12;
    }

    public dy_1 p() {
        return (dy_1)super.clone();
    }

    public dy_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dy_1)super.setField(fieldDescriptor, object);
    }

    public dy_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (dy_1)super.clearField(fieldDescriptor);
    }

    public dy_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (dy_1)super.clearOneof(oneofDescriptor);
    }

    public dy_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (dy_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public dy_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (dy_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public dy_1 a(Message message) {
        if (message instanceof dw_1) {
            return this.a((dw_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public dy_1 a(dw_1 dw_12) {
        if (dw_12 == dw_1.o()) {
            return this;
        }
        this.y().mergeFrom(dw_12.s());
        this.A().mergeFrom(dw_12.t());
        if (dw_12.h()) {
            this.a(dw_12.i());
        }
        if (dw_12.j()) {
            this.b(dw_12.k());
        }
        this.b(dw_1.b(dw_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.h()) {
            return false;
        }
        for (dv_2 dv_22 : this.d().values()) {
            if (dv_22.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public dy_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dw_1 dw_12 = null;
        try {
            dw_12 = (dw_1)dw_1.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dw_12 = (dw_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dw_12 != null) {
                this.a(dw_12);
            }
        }
        return this;
    }

    private MapField<Integer, dv_2> x() {
        if (this.b == null) {
            return MapField.emptyMapField(da_1.a);
        }
        return this.b;
    }

    private MapField<Integer, dv_2> y() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(da_1.a);
        }
        if (!this.b.isMutable()) {
            this.b = this.b.copy();
        }
        return this.b;
    }

    @Override
    public int b() {
        return this.x().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.x().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dv_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, dv_2> d() {
        return this.x().getMap();
    }

    @Override
    public dv_2 a(int n, dv_2 dv_22) {
        Map map = this.x().getMap();
        return map.containsKey(n) ? (dv_2)map.get(n) : dv_22;
    }

    @Override
    public dv_2 b(int n) {
        Map map = this.x().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dv_2)map.get(n);
    }

    public dy_1 q() {
        this.y().getMutableMap().clear();
        return this;
    }

    public dy_1 e(int n) {
        this.y().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, dv_2> r() {
        return this.y().getMutableMap();
    }

    public dy_1 b(int n, dv_2 dv_22) {
        if (dv_22 == null) {
            throw new NullPointerException();
        }
        this.y().getMutableMap().put(n, dv_22);
        return this;
    }

    public dy_1 a(Map<Integer, dv_2> map) {
        this.y().getMutableMap().putAll(map);
        return this;
    }

    private MapField<Integer, Integer> z() {
        if (this.c == null) {
            return MapField.emptyMapField(dz_2.a);
        }
        return this.c;
    }

    private MapField<Integer, Integer> A() {
        this.onChanged();
        if (this.c == null) {
            this.c = MapField.newMapField(dz_2.a);
        }
        if (!this.c.isMutable()) {
            this.c = this.c.copy();
        }
        return this.c;
    }

    @Override
    public int e() {
        return this.z().getMap().size();
    }

    @Override
    public boolean c(int n) {
        return this.z().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> f() {
        return this.g();
    }

    @Override
    public Map<Integer, Integer> g() {
        return this.z().getMap();
    }

    @Override
    public int a(int n, int n2) {
        Map map = this.z().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int d(int n) {
        Map map = this.z().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    public dy_1 s() {
        this.A().getMutableMap().clear();
        return this;
    }

    public dy_1 f(int n) {
        this.A().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, Integer> t() {
        return this.A().getMutableMap();
    }

    public dy_1 b(int n, int n2) {
        this.A().getMutableMap().put(n, n2);
        return this;
    }

    public dy_1 b(Map<Integer, Integer> map) {
        this.A().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 4) == 4;
    }

    @Override
    public boolean i() {
        return this.d;
    }

    public dy_1 a(boolean bl) {
        this.a |= 4;
        this.d = bl;
        this.onChanged();
        return this;
    }

    public dy_1 u() {
        this.a &= 0xFFFFFFFB;
        this.d = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public boolean k() {
        return this.e;
    }

    public dy_1 b(boolean bl) {
        this.a |= 8;
        this.e = bl;
        this.onChanged();
        return this;
    }

    public dy_1 v() {
        this.a &= 0xFFFFFFF7;
        this.e = false;
        this.onChanged();
        return this;
    }

    public final dy_1 a(UnknownFieldSet unknownFieldSet) {
        return (dy_1)super.setUnknownFields(unknownFieldSet);
    }

    public final dy_1 b(UnknownFieldSet unknownFieldSet) {
        return (dy_1)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.l();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.p();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Message buildPartial() {
        return this.o();
    }

    public /* synthetic */ Message build() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.o();
    }

    public /* synthetic */ MessageLite build() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Object clone() {
        return this.p();
    }
}

