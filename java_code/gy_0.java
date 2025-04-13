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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from gY
 */
public final class gy_0
extends GeneratedMessageV3.Builder<gy_0>
implements gz_0 {
    private int a;
    private long b;
    private gp_2 c = null;
    private SingleFieldBuilderV3<gp_2, gr_1, gs_1> d;

    public static final Descriptors.Descriptor a() {
        return gn_1.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gn_1.f.ensureFieldAccessorsInitialized(gw_0.class, gy_0.class);
    }

    gy_0() {
        this.o();
    }

    gy_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (gw_0.m()) {
            this.p();
        }
    }

    public gy_0 g() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return gn_1.e;
    }

    public gw_0 h() {
        return gw_0.j();
    }

    public gw_0 i() {
        gw_0 gw_02 = this.j();
        if (!gw_02.isInitialized()) {
            throw gy_0.newUninitializedMessageException((Message)gw_02);
        }
        return gw_02;
    }

    public gw_0 j() {
        gw_0 gw_02 = new gw_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        gw_02.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        gw_02.g = this.d == null ? this.c : (gp_2)this.d.build();
        gw_02.e = n2;
        this.onBuilt();
        return gw_02;
    }

    public gy_0 k() {
        return (gy_0)super.clone();
    }

    public gy_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gy_0)super.setField(fieldDescriptor, object);
    }

    public gy_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (gy_0)super.clearField(fieldDescriptor);
    }

    public gy_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (gy_0)super.clearOneof(oneofDescriptor);
    }

    public gy_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (gy_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public gy_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (gy_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public gy_0 a(Message message) {
        if (message instanceof gw_0) {
            return this.a((gw_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public gy_0 a(gw_0 gw_02) {
        if (gw_02 == gw_0.j()) {
            return this;
        }
        if (gw_02.b()) {
            this.a(gw_02.c());
        }
        if (gw_02.d()) {
            this.b(gw_02.e());
        }
        this.b(gw_0.b(gw_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        return this.e().isInitialized();
    }

    public gy_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        gw_0 gw_02 = null;
        try {
            gw_02 = (gw_0)gw_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            gw_02 = (gw_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (gw_02 != null) {
                this.a(gw_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public gy_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public gy_0 l() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public gp_2 e() {
        if (this.d == null) {
            return this.c == null ? gp_2.u() : this.c;
        }
        return (gp_2)this.d.getMessage();
    }

    public gy_0 a(gp_2 gp_22) {
        if (this.d == null) {
            if (gp_22 == null) {
                throw new NullPointerException();
            }
            this.c = gp_22;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)gp_22);
        }
        this.a |= 2;
        return this;
    }

    public gy_0 a(gr_1 gr_12) {
        if (this.d == null) {
            this.c = gr_12.t();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)gr_12.t());
        }
        this.a |= 2;
        return this;
    }

    public gy_0 b(gp_2 gp_22) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != gp_2.u() ? gp_2.a(this.c).a(gp_22).u() : gp_22;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)gp_22);
        }
        this.a |= 2;
        return this;
    }

    public gy_0 m() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public gr_1 n() {
        this.a |= 2;
        this.onChanged();
        return (gr_1)this.p().getBuilder();
    }

    @Override
    public gs_1 f() {
        if (this.d != null) {
            return (gs_1)this.d.getMessageOrBuilder();
        }
        return this.c == null ? gp_2.u() : this.c;
    }

    private SingleFieldBuilderV3<gp_2, gr_1, gs_1> p() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final gy_0 a(UnknownFieldSet unknownFieldSet) {
        return (gy_0)super.setUnknownFields(unknownFieldSet);
    }

    public final gy_0 b(UnknownFieldSet unknownFieldSet) {
        return (gy_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
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
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
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
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

