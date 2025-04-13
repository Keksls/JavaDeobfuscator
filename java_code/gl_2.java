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
 * Renamed from gl
 */
public final class gl_2
extends GeneratedMessageV3.Builder<gl_2>
implements gn_2 {
    private int a;
    private MapField<Integer, gf_2> b;
    private dw_1 c = null;
    private SingleFieldBuilderV3<dw_1, dy_1, db_1> d;

    public static final Descriptors.Descriptor a() {
        return gd_2.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.r();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.s();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gd_2.b.ensureFieldAccessorsInitialized(gj_2.class, gl_2.class);
    }

    gl_2() {
        this.q();
    }

    gl_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.q();
    }

    private void q() {
        if (gj_2.n()) {
            this.t();
        }
    }

    public gl_2 h() {
        super.clear();
        this.s().clear();
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gd_2.a;
    }

    public gj_2 i() {
        return gj_2.k();
    }

    public gj_2 j() {
        gj_2 gj_22 = this.k();
        if (!gj_22.isInitialized()) {
            throw gl_2.newUninitializedMessageException((Message)gj_22);
        }
        return gj_22;
    }

    public gj_2 k() {
        gj_2 gj_22 = new gj_2(this);
        int n = this.a;
        int n2 = 0;
        gj_22.f = this.r();
        gj_22.f.makeImmutable();
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        gj_22.g = this.d == null ? this.c : (dw_1)this.d.build();
        gj_22.e = n2;
        this.onBuilt();
        return gj_22;
    }

    public gl_2 l() {
        return (gl_2)super.clone();
    }

    public gl_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gl_2)super.setField(fieldDescriptor, object);
    }

    public gl_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gl_2)super.clearField(fieldDescriptor);
    }

    public gl_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gl_2)super.clearOneof(oneofDescriptor);
    }

    public gl_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gl_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gl_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gl_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public gl_2 a(Message message) {
        if (message instanceof gj_2) {
            return this.a((gj_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gl_2 a(gj_2 gj_22) {
        if (gj_22 == gj_2.k()) {
            return this;
        }
        this.s().mergeFrom(gj_22.o());
        if (gj_22.e()) {
            this.b(gj_22.f());
        }
        this.b(gj_2.b(gj_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (gf_2 gf_22 : this.d().values()) {
            if (gf_22.isInitialized()) continue;
            return false;
        }
        return !this.e() || this.f().isInitialized();
    }

    public gl_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gj_2 gj_22 = null;
        try {
            gj_22 = (gj_2)gj_2.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gj_22 = (gj_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gj_22 != null) {
                this.a(gj_22);
            }
        }
        return this;
    }

    private MapField<Integer, gf_2> r() {
        if (this.b == null) {
            return MapField.emptyMapField(gm_2.a);
        }
        return this.b;
    }

    private MapField<Integer, gf_2> s() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(gm_2.a);
        }
        if (!this.b.isMutable()) {
            this.b = this.b.copy();
        }
        return this.b;
    }

    @Override
    public int b() {
        return this.r().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.r().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, gf_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, gf_2> d() {
        return this.r().getMap();
    }

    @Override
    public gf_2 a(int n, gf_2 gf_22) {
        Map map = this.r().getMap();
        return map.containsKey(n) ? (gf_2)map.get(n) : gf_22;
    }

    @Override
    public gf_2 b(int n) {
        Map map = this.r().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (gf_2)map.get(n);
    }

    public gl_2 m() {
        this.s().getMutableMap().clear();
        return this;
    }

    public gl_2 c(int n) {
        this.s().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, gf_2> n() {
        return this.s().getMutableMap();
    }

    public gl_2 b(int n, gf_2 gf_22) {
        if (gf_22 == null) {
            throw new NullPointerException();
        }
        this.s().getMutableMap().put(n, gf_22);
        return this;
    }

    public gl_2 a(Map<Integer, gf_2> map) {
        this.s().getMutableMap().putAll(map);
        return this;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public dw_1 f() {
        if (this.d == null) {
            return this.c == null ? dw_1.o() : this.c;
        }
        return (dw_1)this.d.getMessage();
    }

    public gl_2 a(dw_1 dw_12) {
        if (this.d == null) {
            if (dw_12 == null) {
                throw new NullPointerException();
            }
            this.c = dw_12;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)dw_12);
        }
        this.a |= 2;
        return this;
    }

    public gl_2 a(dy_1 dy_12) {
        if (this.d == null) {
            this.c = dy_12.n();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)dy_12.n());
        }
        this.a |= 2;
        return this;
    }

    public gl_2 b(dw_1 dw_12) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != dw_1.o() ? dw_1.a(this.c).a(dw_12).o() : dw_12;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)dw_12);
        }
        this.a |= 2;
        return this;
    }

    public gl_2 o() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public dy_1 p() {
        this.a |= 2;
        this.onChanged();
        return (dy_1)this.t().getBuilder();
    }

    @Override
    public db_1 g() {
        if (this.d != null) {
            return (db_1)this.d.getMessageOrBuilder();
        }
        return this.c == null ? dw_1.o() : this.c;
    }

    private SingleFieldBuilderV3<dw_1, dy_1, db_1> t() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.f(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final gl_2 a(UnknownFieldSet unknownFieldSet) {
        return (gl_2)super.setUnknownFields(unknownFieldSet);
    }

    public final gl_2 b(UnknownFieldSet unknownFieldSet) {
        return (gl_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.h();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.l();
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
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.l();
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
        return this.l();
    }

    public /* synthetic */ Message buildPartial() {
        return this.k();
    }

    public /* synthetic */ Message build() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.k();
    }

    public /* synthetic */ MessageLite build() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

