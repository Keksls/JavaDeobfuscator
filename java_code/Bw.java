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

public final class Bw
extends GeneratedMessageV3.Builder<Bw>
implements Bx {
    private int a;
    private long b;
    private bl_0 c = null;
    private SingleFieldBuilderV3<bl_0, BN, BO> d;
    private long e;

    public static final Descriptors.Descriptor a() {
        return AO.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.n.ensureFieldAccessorsInitialized(Bu.class, Bw.class);
    }

    Bw() {
        this.r();
    }

    Bw(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.r();
    }

    private void r() {
        if (Bu.o()) {
            this.s();
        }
    }

    public Bw i() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        this.e = 0L;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return AO.m;
    }

    public Bu j() {
        return Bu.l();
    }

    public Bu k() {
        Bu bu = this.l();
        if (!bu.isInitialized()) {
            throw Bw.newUninitializedMessageException((Message)bu);
        }
        return bu;
    }

    public Bu l() {
        Bu bu = new Bu(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        bu.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        bu.h = this.d == null ? this.c : (bl_0)this.d.build();
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        bu.i = this.e;
        bu.f = n2;
        this.onBuilt();
        return bu;
    }

    public Bw m() {
        return (Bw)super.clone();
    }

    public Bw a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Bw)super.setField(fieldDescriptor, object);
    }

    public Bw a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Bw)super.clearField(fieldDescriptor);
    }

    public Bw a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Bw)super.clearOneof(oneofDescriptor);
    }

    public Bw a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Bw)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Bw b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Bw)super.addRepeatedField(fieldDescriptor, object);
    }

    public Bw a(Message message) {
        if (message instanceof Bu) {
            return this.a((Bu)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Bw a(Bu bu) {
        if (bu == Bu.l()) {
            return this;
        }
        if (bu.b()) {
            this.a(bu.c());
        }
        if (bu.d()) {
            this.b(bu.e());
        }
        if (bu.g()) {
            this.b(bu.h());
        }
        this.b(Bu.b(bu));
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

    public Bw a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Bu bu = null;
        try {
            bu = (Bu)Bu.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bu = (Bu)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bu != null) {
                this.a(bu);
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

    public Bw a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public Bw n() {
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
    public bl_0 e() {
        if (this.d == null) {
            return this.c == null ? bl_0.u() : this.c;
        }
        return (bl_0)this.d.getMessage();
    }

    public Bw a(bl_0 bl_02) {
        if (this.d == null) {
            if (bl_02 == null) {
                throw new NullPointerException();
            }
            this.c = bl_02;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bl_02);
        }
        this.a |= 2;
        return this;
    }

    public Bw a(BN bN) {
        if (this.d == null) {
            this.c = bN.t();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bN.t());
        }
        this.a |= 2;
        return this;
    }

    public Bw b(bl_0 bl_02) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != bl_0.u() ? bl_0.a(this.c).a(bl_02).u() : bl_02;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)bl_02);
        }
        this.a |= 2;
        return this;
    }

    public Bw o() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public BN p() {
        this.a |= 2;
        this.onChanged();
        return (BN)this.s().getBuilder();
    }

    @Override
    public BO f() {
        if (this.d != null) {
            return (BO)this.d.getMessageOrBuilder();
        }
        return this.c == null ? bl_0.u() : this.c;
    }

    private SingleFieldBuilderV3<bl_0, BN, BO> s() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public long h() {
        return this.e;
    }

    public Bw b(long l) {
        this.a |= 4;
        this.e = l;
        this.onChanged();
        return this;
    }

    public Bw q() {
        this.a &= 0xFFFFFFFB;
        this.e = 0L;
        this.onChanged();
        return this;
    }

    public final Bw a(UnknownFieldSet unknownFieldSet) {
        return (Bw)super.setUnknownFields(unknownFieldSet);
    }

    public final Bw b(UnknownFieldSet unknownFieldSet) {
        return (Bw)super.mergeUnknownFields(unknownFieldSet);
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
        return this.i();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.m();
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
        return this.i();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.m();
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
        return this.m();
    }

    public /* synthetic */ Message buildPartial() {
        return this.l();
    }

    public /* synthetic */ Message build() {
        return this.k();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.l();
    }

    public /* synthetic */ MessageLite build() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.i();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.m();
    }

    public /* synthetic */ Object clone() {
        return this.m();
    }
}

