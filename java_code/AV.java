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

public final class AV
extends GeneratedMessageV3.Builder<AV>
implements AW {
    private int a;
    private long b;
    private bl_0 c = null;
    private SingleFieldBuilderV3<bl_0, BN, BO> d;

    public static final Descriptors.Descriptor a() {
        return AO.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.d.ensureFieldAccessorsInitialized(AT.class, AV.class);
    }

    AV() {
        this.o();
    }

    AV(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (AT.m()) {
            this.p();
        }
    }

    public AV g() {
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
        return AO.c;
    }

    public AT h() {
        return AT.j();
    }

    public AT i() {
        AT aT = this.j();
        if (!aT.isInitialized()) {
            throw AV.newUninitializedMessageException((Message)aT);
        }
        return aT;
    }

    public AT j() {
        AT aT = new AT(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        aT.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        aT.g = this.d == null ? this.c : (bl_0)this.d.build();
        aT.e = n2;
        this.onBuilt();
        return aT;
    }

    public AV k() {
        return (AV)super.clone();
    }

    public AV a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AV)super.setField(fieldDescriptor, object);
    }

    public AV a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (AV)super.clearField(fieldDescriptor);
    }

    public AV a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (AV)super.clearOneof(oneofDescriptor);
    }

    public AV a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (AV)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public AV b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (AV)super.addRepeatedField(fieldDescriptor, object);
    }

    public AV a(Message message) {
        if (message instanceof AT) {
            return this.a((AT)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public AV a(AT aT) {
        if (aT == AT.j()) {
            return this;
        }
        if (aT.b()) {
            this.a(aT.c());
        }
        if (aT.d()) {
            this.b(aT.e());
        }
        this.b(AT.b(aT));
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

    public AV a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        AT aT = null;
        try {
            aT = (AT)AT.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            aT = (AT)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (aT != null) {
                this.a(aT);
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

    public AV a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public AV l() {
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

    public AV a(bl_0 bl_02) {
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

    public AV a(BN bN) {
        if (this.d == null) {
            this.c = bN.t();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bN.t());
        }
        this.a |= 2;
        return this;
    }

    public AV b(bl_0 bl_02) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != bl_0.u() ? bl_0.a(this.c).a(bl_02).u() : bl_02;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)bl_02);
        }
        this.a |= 2;
        return this;
    }

    public AV m() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public BN n() {
        this.a |= 2;
        this.onChanged();
        return (BN)this.p().getBuilder();
    }

    @Override
    public BO f() {
        if (this.d != null) {
            return (BO)this.d.getMessageOrBuilder();
        }
        return this.c == null ? bl_0.u() : this.c;
    }

    private SingleFieldBuilderV3<bl_0, BN, BO> p() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final AV a(UnknownFieldSet unknownFieldSet) {
        return (AV)super.setUnknownFields(unknownFieldSet);
    }

    public final AV b(UnknownFieldSet unknownFieldSet) {
        return (AV)super.mergeUnknownFields(unknownFieldSet);
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

