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
 * Renamed from ab
 */
public final class ab_1
extends GeneratedMessageV3.Builder<ab_1>
implements ac_1 {
    private W a = null;
    private SingleFieldBuilderV3<W, Y, al_1> b;

    public static final Descriptors.Descriptor a() {
        return e_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.h.ensureFieldAccessorsInitialized(Z.class, ab_1.class);
    }

    ab_1() {
        this.l();
    }

    ab_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (Z.k()) {
            // empty if block
        }
    }

    public ab_1 e() {
        super.clear();
        if (this.b == null) {
            this.a = null;
        } else {
            this.a = null;
            this.b = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return e_0.g;
    }

    public Z f() {
        return Z.h();
    }

    public Z g() {
        Z z = this.h();
        if (!z.isInitialized()) {
            throw ab_1.newUninitializedMessageException((Message)z);
        }
        return z;
    }

    public Z h() {
        Z z = new Z(this);
        z.c = this.b == null ? this.a : (W)this.b.build();
        this.onBuilt();
        return z;
    }

    public ab_1 i() {
        return (ab_1)super.clone();
    }

    public ab_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ab_1)super.setField(fieldDescriptor, object);
    }

    public ab_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ab_1)super.clearField(fieldDescriptor);
    }

    public ab_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ab_1)super.clearOneof(oneofDescriptor);
    }

    public ab_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ab_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ab_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ab_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public ab_1 a(Message message) {
        if (message instanceof Z) {
            return this.a((Z)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ab_1 a(Z z) {
        if (z == Z.h()) {
            return this;
        }
        if (z.b()) {
            this.b(z.c());
        }
        this.b(Z.b(z));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public ab_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        Z z = null;
        try {
            z = (Z)Z.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            z = (Z)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (z != null) {
                this.a(z);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return this.b != null || this.a != null;
    }

    @Override
    public W c() {
        if (this.b == null) {
            return this.a == null ? W.k() : this.a;
        }
        return (W)this.b.getMessage();
    }

    public ab_1 a(W w) {
        if (this.b == null) {
            if (w == null) {
                throw new NullPointerException();
            }
            this.a = w;
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)w);
        }
        return this;
    }

    public ab_1 a(Y y) {
        if (this.b == null) {
            this.a = y.j();
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)y.j());
        }
        return this;
    }

    public ab_1 b(W w) {
        if (this.b == null) {
            this.a = this.a != null ? W.a(this.a).a(w).k() : w;
            this.onChanged();
        } else {
            this.b.mergeFrom((AbstractMessage)w);
        }
        return this;
    }

    public ab_1 j() {
        if (this.b == null) {
            this.a = null;
            this.onChanged();
        } else {
            this.a = null;
            this.b = null;
        }
        return this;
    }

    public Y k() {
        this.onChanged();
        return (Y)this.m().getBuilder();
    }

    @Override
    public al_1 d() {
        if (this.b != null) {
            return (al_1)this.b.getMessageOrBuilder();
        }
        return this.a == null ? W.k() : this.a;
    }

    private SingleFieldBuilderV3<W, Y, al_1> m() {
        if (this.b == null) {
            this.b = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.a = null;
        }
        return this.b;
    }

    public final ab_1 a(UnknownFieldSet unknownFieldSet) {
        return (ab_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final ab_1 b(UnknownFieldSet unknownFieldSet) {
        return (ab_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

