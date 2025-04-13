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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from aj
 */
public final class aj_1
extends GeneratedMessageV3.Builder<aj_1>
implements ak_1 {
    private int a;
    private List<W> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<W, Y, al_1> c;

    public static final Descriptors.Descriptor a() {
        return e_0.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.n.ensureFieldAccessorsInitialized(ah_2.class, aj_1.class);
    }

    aj_1() {
        this.m();
    }

    aj_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (ah_2.k()) {
            this.o();
        }
    }

    public aj_1 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return e_0.m;
    }

    public ah_2 f() {
        return ah_2.h();
    }

    public ah_2 g() {
        ah_2 ah_22 = this.h();
        if (!ah_22.isInitialized()) {
            throw aj_1.newUninitializedMessageException((Message)ah_22);
        }
        return ah_22;
    }

    public ah_2 h() {
        ah_2 ah_22 = new ah_2(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            ah_22.c = this.b;
        } else {
            ah_22.c = this.c.build();
        }
        this.onBuilt();
        return ah_22;
    }

    public aj_1 i() {
        return (aj_1)super.clone();
    }

    public aj_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (aj_1)super.setField(fieldDescriptor, object);
    }

    public aj_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (aj_1)super.clearField(fieldDescriptor);
    }

    public aj_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (aj_1)super.clearOneof(oneofDescriptor);
    }

    public aj_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (aj_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public aj_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (aj_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public aj_1 a(Message message) {
        if (message instanceof ah_2) {
            return this.a((ah_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public aj_1 a(ah_2 ah_22) {
        if (ah_22 == ah_2.h()) {
            return this;
        }
        if (this.c == null) {
            if (!ah_22.c.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = ah_22.c;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(ah_22.c);
                }
                this.onChanged();
            }
        } else if (!ah_22.c.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = ah_22.c;
                this.a &= 0xFFFFFFFE;
                this.c = ah_2.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(ah_22.c);
            }
        }
        this.b(ah_2.b(ah_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public aj_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ah_2 ah_22 = null;
        try {
            ah_22 = (ah_2)ah_2.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ah_22 = (ah_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ah_22 != null) {
                this.a(ah_22);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<W>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<W> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public W a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (W)this.c.getMessage(n);
    }

    public aj_1 a(int n, W w) {
        if (this.c == null) {
            if (w == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, w);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)w);
        }
        return this;
    }

    public aj_1 a(int n, Y y) {
        if (this.c == null) {
            this.n();
            this.b.set(n, y.j());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)y.j());
        }
        return this;
    }

    public aj_1 a(W w) {
        if (this.c == null) {
            if (w == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(w);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)w);
        }
        return this;
    }

    public aj_1 b(int n, W w) {
        if (this.c == null) {
            if (w == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, w);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)w);
        }
        return this;
    }

    public aj_1 a(Y y) {
        if (this.c == null) {
            this.n();
            this.b.add(y.j());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)y.j());
        }
        return this;
    }

    public aj_1 b(int n, Y y) {
        if (this.c == null) {
            this.n();
            this.b.add(n, y.j());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)y.j());
        }
        return this;
    }

    public aj_1 a(Iterable<? extends W> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public aj_1 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public aj_1 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public Y d(int n) {
        return (Y)this.o().getBuilder(n);
    }

    @Override
    public al_1 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (al_1)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends al_1> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public Y k() {
        return (Y)this.o().addBuilder((AbstractMessage)W.k());
    }

    public Y e(int n) {
        return (Y)this.o().addBuilder(n, (AbstractMessage)W.k());
    }

    public List<Y> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<W, Y, al_1> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final aj_1 a(UnknownFieldSet unknownFieldSet) {
        return (aj_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final aj_1 b(UnknownFieldSet unknownFieldSet) {
        return (aj_1)super.mergeUnknownFields(unknownFieldSet);
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

