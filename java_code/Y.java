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

public final class Y
extends GeneratedMessageV3.Builder<Y>
implements al_1 {
    private cd_2 a = null;
    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> b;
    private cd_2 c = null;
    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> d;

    public static final Descriptors.Descriptor a() {
        return e_0.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.l.ensureFieldAccessorsInitialized(W.class, Y.class);
    }

    Y() {
        this.q();
    }

    Y(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.q();
    }

    private void q() {
        if (W.n()) {
            // empty if block
        }
    }

    public Y h() {
        super.clear();
        if (this.b == null) {
            this.a = null;
        } else {
            this.a = null;
            this.b = null;
        }
        if (this.d == null) {
            this.c = null;
        } else {
            this.c = null;
            this.d = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return e_0.k;
    }

    public W i() {
        return W.k();
    }

    public W j() {
        W w = this.k();
        if (!w.isInitialized()) {
            throw Y.newUninitializedMessageException((Message)w);
        }
        return w;
    }

    public W k() {
        W w = new W(this);
        w.d = this.b == null ? this.a : (cd_2)this.b.build();
        w.e = this.d == null ? this.c : (cd_2)this.d.build();
        this.onBuilt();
        return w;
    }

    public Y l() {
        return (Y)super.clone();
    }

    public Y a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Y)super.setField(fieldDescriptor, object);
    }

    public Y a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Y)super.clearField(fieldDescriptor);
    }

    public Y a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Y)super.clearOneof(oneofDescriptor);
    }

    public Y a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Y)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Y b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Y)super.addRepeatedField(fieldDescriptor, object);
    }

    public Y a(Message message) {
        if (message instanceof W) {
            return this.a((W)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Y a(W w) {
        if (w == W.k()) {
            return this;
        }
        if (w.b()) {
            this.b(w.c());
        }
        if (w.e()) {
            this.d(w.f());
        }
        this.b(W.b(w));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public Y a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        W w = null;
        try {
            w = (W)W.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            w = (W)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (w != null) {
                this.a(w);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return this.b != null || this.a != null;
    }

    @Override
    public cd_2 c() {
        if (this.b == null) {
            return this.a == null ? cd_2.j() : this.a;
        }
        return (cd_2)this.b.getMessage();
    }

    public Y a(cd_2 cd_22) {
        if (this.b == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.a = cd_22;
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)cd_22);
        }
        return this;
    }

    public Y a(cf_2 cf_22) {
        if (this.b == null) {
            this.a = cf_22.i();
            this.onChanged();
        } else {
            this.b.setMessage((AbstractMessage)cf_22.i());
        }
        return this;
    }

    public Y b(cd_2 cd_22) {
        if (this.b == null) {
            this.a = this.a != null ? cd_2.a(this.a).a(cd_22).j() : cd_22;
            this.onChanged();
        } else {
            this.b.mergeFrom((AbstractMessage)cd_22);
        }
        return this;
    }

    public Y m() {
        if (this.b == null) {
            this.a = null;
            this.onChanged();
        } else {
            this.a = null;
            this.b = null;
        }
        return this;
    }

    public cf_2 n() {
        this.onChanged();
        return (cf_2)this.r().getBuilder();
    }

    @Override
    public cq_1 d() {
        if (this.b != null) {
            return (cq_1)this.b.getMessageOrBuilder();
        }
        return this.a == null ? cd_2.j() : this.a;
    }

    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> r() {
        if (this.b == null) {
            this.b = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.a = null;
        }
        return this.b;
    }

    @Override
    public boolean e() {
        return this.d != null || this.c != null;
    }

    @Override
    public cd_2 f() {
        if (this.d == null) {
            return this.c == null ? cd_2.j() : this.c;
        }
        return (cd_2)this.d.getMessage();
    }

    public Y c(cd_2 cd_22) {
        if (this.d == null) {
            if (cd_22 == null) {
                throw new NullPointerException();
            }
            this.c = cd_22;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)cd_22);
        }
        return this;
    }

    public Y b(cf_2 cf_22) {
        if (this.d == null) {
            this.c = cf_22.i();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)cf_22.i());
        }
        return this;
    }

    public Y d(cd_2 cd_22) {
        if (this.d == null) {
            this.c = this.c != null ? cd_2.a(this.c).a(cd_22).j() : cd_22;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)cd_22);
        }
        return this;
    }

    public Y o() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.c = null;
            this.d = null;
        }
        return this;
    }

    public cf_2 p() {
        this.onChanged();
        return (cf_2)this.s().getBuilder();
    }

    @Override
    public cq_1 g() {
        if (this.d != null) {
            return (cq_1)this.d.getMessageOrBuilder();
        }
        return this.c == null ? cd_2.j() : this.c;
    }

    private SingleFieldBuilderV3<cd_2, cf_2, cq_1> s() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.f(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final Y a(UnknownFieldSet unknownFieldSet) {
        return (Y)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final Y b(UnknownFieldSet unknownFieldSet) {
        return (Y)super.mergeUnknownFields(unknownFieldSet);
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

