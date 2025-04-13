/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from dE
 */
public final class de_2
extends GeneratedMessageV3.Builder<de_2>
implements dg_1 {
    private int a;
    private MapField<Integer, dp_2> b;
    private di_1 c = null;
    private SingleFieldBuilderV3<di_1, dk_1, dq_2> d;
    private dw_1 e = null;
    private SingleFieldBuilderV3<dw_1, dy_1, db_1> f;

    public static final Descriptors.Descriptor a() {
        return dn_1.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.w();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.x();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.b.ensureFieldAccessorsInitialized(dc_1.class, de_2.class);
    }

    de_2() {
        this.v();
    }

    de_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.v();
    }

    private void v() {
        if (dc_1.q()) {
            this.y();
            this.z();
        }
    }

    public de_2 k() {
        super.clear();
        this.x().clear();
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        if (this.f == null) {
            this.e = null;
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dn_1.a;
    }

    public dc_1 l() {
        return dc_1.n();
    }

    public dc_1 m() {
        dc_1 dc_12 = this.n();
        if (!dc_12.isInitialized()) {
            throw de_2.newUninitializedMessageException((Message)dc_12);
        }
        return dc_12;
    }

    public dc_1 n() {
        dc_1 dc_12 = new dc_1(this);
        int n = this.a;
        int n2 = 0;
        dc_12.g = this.w();
        dc_12.g.makeImmutable();
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        dc_12.h = this.d == null ? this.c : (di_1)this.d.build();
        if ((n & 4) == 4) {
            n2 |= 2;
        }
        dc_12.i = this.f == null ? this.e : (dw_1)this.f.build();
        dc_12.f = n2;
        this.onBuilt();
        return dc_12;
    }

    public de_2 o() {
        return (de_2)super.clone();
    }

    public de_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (de_2)super.setField(fieldDescriptor, object);
    }

    public de_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (de_2)super.clearField(fieldDescriptor);
    }

    public de_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (de_2)super.clearOneof(oneofDescriptor);
    }

    public de_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (de_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public de_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (de_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public de_2 a(Message message) {
        if (message instanceof dc_1) {
            return this.a((dc_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public de_2 a(dc_1 dc_12) {
        if (dc_12 == dc_1.n()) {
            return this;
        }
        this.x().mergeFrom(dc_12.r());
        if (dc_12.e()) {
            this.b(dc_12.f());
        }
        if (dc_12.h()) {
            this.b(dc_12.i());
        }
        this.b(dc_1.b(dc_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (dp_2 dp_22 : this.d().values()) {
            if (dp_22.isInitialized()) continue;
            return false;
        }
        if (this.e() && !this.f().isInitialized()) {
            return false;
        }
        return !this.h() || this.i().isInitialized();
    }

    public de_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        dc_1 dc_12 = null;
        try {
            dc_12 = (dc_1)dc_1.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            dc_12 = (dc_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (dc_12 != null) {
                this.a(dc_12);
            }
        }
        return this;
    }

    private MapField<Integer, dp_2> w() {
        if (this.b == null) {
            return MapField.emptyMapField(df_2.a);
        }
        return this.b;
    }

    private MapField<Integer, dp_2> x() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(df_2.a);
        }
        if (!this.b.isMutable()) {
            this.b = this.b.copy();
        }
        return this.b;
    }

    @Override
    public int b() {
        return this.w().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.w().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dp_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, dp_2> d() {
        return this.w().getMap();
    }

    @Override
    public dp_2 a(int n, dp_2 dp_22) {
        Map map = this.w().getMap();
        return map.containsKey(n) ? (dp_2)map.get(n) : dp_22;
    }

    @Override
    public dp_2 b(int n) {
        Map map = this.w().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dp_2)map.get(n);
    }

    public de_2 p() {
        this.x().getMutableMap().clear();
        return this;
    }

    public de_2 c(int n) {
        this.x().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, dp_2> q() {
        return this.x().getMutableMap();
    }

    public de_2 b(int n, dp_2 dp_22) {
        if (dp_22 == null) {
            throw new NullPointerException();
        }
        this.x().getMutableMap().put(n, dp_22);
        return this;
    }

    public de_2 a(Map<Integer, dp_2> map) {
        this.x().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public di_1 f() {
        if (this.d == null) {
            return this.c == null ? di_1.j() : this.c;
        }
        return (di_1)this.d.getMessage();
    }

    public de_2 a(di_1 di_12) {
        if (this.d == null) {
            if (di_12 == null) {
                throw new NullPointerException();
            }
            this.c = di_12;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)di_12);
        }
        this.a |= 2;
        return this;
    }

    public de_2 a(dk_1 dk_12) {
        if (this.d == null) {
            this.c = dk_12.i();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)dk_12.i());
        }
        this.a |= 2;
        return this;
    }

    public de_2 b(di_1 di_12) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != di_1.j() ? di_1.a(this.c).a(di_12).j() : di_12;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)di_12);
        }
        this.a |= 2;
        return this;
    }

    public de_2 r() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public dk_1 s() {
        this.a |= 2;
        this.onChanged();
        return (dk_1)this.y().getBuilder();
    }

    @Override
    public dq_2 g() {
        if (this.d != null) {
            return (dq_2)this.d.getMessageOrBuilder();
        }
        return this.c == null ? di_1.j() : this.c;
    }

    private SingleFieldBuilderV3<di_1, dk_1, dq_2> y() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.f(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    @Override
    public boolean h() {
        return (this.a & 4) == 4;
    }

    @Override
    public dw_1 i() {
        if (this.f == null) {
            return this.e == null ? dw_1.o() : this.e;
        }
        return (dw_1)this.f.getMessage();
    }

    public de_2 a(dw_1 dw_12) {
        if (this.f == null) {
            if (dw_12 == null) {
                throw new NullPointerException();
            }
            this.e = dw_12;
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)dw_12);
        }
        this.a |= 4;
        return this;
    }

    public de_2 a(dy_1 dy_12) {
        if (this.f == null) {
            this.e = dy_12.n();
            this.onChanged();
        } else {
            this.f.setMessage((AbstractMessage)dy_12.n());
        }
        this.a |= 4;
        return this;
    }

    public de_2 b(dw_1 dw_12) {
        if (this.f == null) {
            this.e = (this.a & 4) == 4 && this.e != null && this.e != dw_1.o() ? dw_1.a(this.e).a(dw_12).o() : dw_12;
            this.onChanged();
        } else {
            this.f.mergeFrom((AbstractMessage)dw_12);
        }
        this.a |= 4;
        return this;
    }

    public de_2 t() {
        if (this.f == null) {
            this.e = null;
            this.onChanged();
        } else {
            this.f.clear();
        }
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public dy_1 u() {
        this.a |= 4;
        this.onChanged();
        return (dy_1)this.z().getBuilder();
    }

    @Override
    public db_1 j() {
        if (this.f != null) {
            return (db_1)this.f.getMessageOrBuilder();
        }
        return this.e == null ? dw_1.o() : this.e;
    }

    private SingleFieldBuilderV3<dw_1, dy_1, db_1> z() {
        if (this.f == null) {
            this.f = new SingleFieldBuilderV3((AbstractMessage)this.i(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.e = null;
        }
        return this.f;
    }

    public final de_2 a(UnknownFieldSet unknownFieldSet) {
        return (de_2)super.setUnknownFields(unknownFieldSet);
    }

    public final de_2 b(UnknownFieldSet unknownFieldSet) {
        return (de_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.k();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.o();
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
        return this.k();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.o();
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
        return this.o();
    }

    public /* synthetic */ Message buildPartial() {
        return this.n();
    }

    public /* synthetic */ Message build() {
        return this.m();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.n();
    }

    public /* synthetic */ MessageLite build() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ Object clone() {
        return this.o();
    }
}

