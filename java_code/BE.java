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

public final class BE
extends GeneratedMessageV3.Builder<BE>
implements bf_0 {
    private int a;
    private int b;
    private AY c = null;
    private SingleFieldBuilderV3<AY, ba_0, bb_0> d;

    public static final Descriptors.Descriptor a() {
        return AO.s;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.t.ensureFieldAccessorsInitialized(bc_0.class, BE.class);
    }

    BE() {
        this.o();
    }

    BE(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (bc_0.m()) {
            this.p();
        }
    }

    public BE g() {
        super.clear();
        this.b = 0;
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
        return AO.s;
    }

    public bc_0 h() {
        return bc_0.j();
    }

    public bc_0 i() {
        bc_0 bc_02 = this.j();
        if (!bc_02.isInitialized()) {
            throw BE.newUninitializedMessageException((Message)bc_02);
        }
        return bc_02;
    }

    public bc_0 j() {
        bc_0 bc_02 = new bc_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        bc_02.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        bc_02.g = this.d == null ? this.c : (AY)this.d.build();
        bc_02.e = n2;
        this.onBuilt();
        return bc_02;
    }

    public BE k() {
        return (BE)super.clone();
    }

    public BE a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (BE)super.setField(fieldDescriptor, object);
    }

    public BE a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (BE)super.clearField(fieldDescriptor);
    }

    public BE a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (BE)super.clearOneof(oneofDescriptor);
    }

    public BE a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (BE)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public BE b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (BE)super.addRepeatedField(fieldDescriptor, object);
    }

    public BE a(Message message) {
        if (message instanceof bc_0) {
            return this.a((bc_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public BE a(bc_0 bc_02) {
        if (bc_02 == bc_0.j()) {
            return this;
        }
        if (bc_02.b()) {
            this.a(bc_02.c());
        }
        if (bc_02.d()) {
            this.b(bc_02.e());
        }
        this.b(bc_0.b(bc_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return !this.d() || this.e().isInitialized();
    }

    public BE a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bc_0 bc_02 = null;
        try {
            bc_02 = (bc_0)bc_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bc_02 = (bc_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bc_02 != null) {
                this.a(bc_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public BE a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public BE l() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public AY e() {
        if (this.d == null) {
            return this.c == null ? AY.q() : this.c;
        }
        return (AY)this.d.getMessage();
    }

    public BE a(AY aY) {
        if (this.d == null) {
            if (aY == null) {
                throw new NullPointerException();
            }
            this.c = aY;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)aY);
        }
        this.a |= 2;
        return this;
    }

    public BE a(ba_0 ba_02) {
        if (this.d == null) {
            this.c = ba_02.p();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)ba_02.p());
        }
        this.a |= 2;
        return this;
    }

    public BE b(AY aY) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != AY.q() ? AY.a(this.c).a(aY).q() : aY;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)aY);
        }
        this.a |= 2;
        return this;
    }

    public BE m() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public ba_0 n() {
        this.a |= 2;
        this.onChanged();
        return (ba_0)this.p().getBuilder();
    }

    @Override
    public bb_0 f() {
        if (this.d != null) {
            return (bb_0)this.d.getMessageOrBuilder();
        }
        return this.c == null ? AY.q() : this.c;
    }

    private SingleFieldBuilderV3<AY, ba_0, bb_0> p() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final BE a(UnknownFieldSet unknownFieldSet) {
        return (BE)super.setUnknownFields(unknownFieldSet);
    }

    public final BE b(UnknownFieldSet unknownFieldSet) {
        return (BE)super.mergeUnknownFields(unknownFieldSet);
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

