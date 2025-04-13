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
 * Renamed from lY
 */
public final class ly_0
extends GeneratedMessageV3.Builder<ly_0>
implements lZ {
    private int a;
    private List<le_0> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<le_0, lg, lp> c;

    public static final Descriptors.Descriptor a() {
        return kM.A;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.B.ensureFieldAccessorsInitialized(lW.class, ly_0.class);
    }

    ly_0() {
        this.m();
    }

    ly_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (lW.k()) {
            this.o();
        }
    }

    public ly_0 e() {
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
        return kM.A;
    }

    public lW f() {
        return lW.h();
    }

    public lW g() {
        lW lW2 = this.h();
        if (!lW2.isInitialized()) {
            throw ly_0.newUninitializedMessageException((Message)lW2);
        }
        return lW2;
    }

    public lW h() {
        lW lW2 = new lW(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            lW2.d = this.b;
        } else {
            lW2.d = this.c.build();
        }
        this.onBuilt();
        return lW2;
    }

    public ly_0 i() {
        return (ly_0)super.clone();
    }

    public ly_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ly_0)super.setField(fieldDescriptor, object);
    }

    public ly_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ly_0)super.clearField(fieldDescriptor);
    }

    public ly_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ly_0)super.clearOneof(oneofDescriptor);
    }

    public ly_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ly_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ly_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ly_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ly_0 a(Message message) {
        if (message instanceof lW) {
            return this.a((lW)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ly_0 a(lW lW2) {
        if (lW2 == lW.h()) {
            return this;
        }
        if (this.c == null) {
            if (!lW2.d.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = lW2.d;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(lW2.d);
                }
                this.onChanged();
            }
        } else if (!lW2.d.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = lW2.d;
                this.a &= 0xFFFFFFFE;
                this.c = lW.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(lW2.d);
            }
        }
        this.b(lW.b(lW2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public ly_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lW lW2 = null;
        try {
            lW2 = (lW)lW.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lW2 = (lW)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lW2 != null) {
                this.a(lW2);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<le_0>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<le_0> b() {
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
    public le_0 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (le_0)this.c.getMessage(n);
    }

    public ly_0 a(int n, le_0 le_02) {
        if (this.c == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, le_02);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)le_02);
        }
        return this;
    }

    public ly_0 a(int n, lg lg2) {
        if (this.c == null) {
            this.n();
            this.b.set(n, lg2.G());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)lg2.G());
        }
        return this;
    }

    public ly_0 a(le_0 le_02) {
        if (this.c == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(le_02);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)le_02);
        }
        return this;
    }

    public ly_0 b(int n, le_0 le_02) {
        if (this.c == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, le_02);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)le_02);
        }
        return this;
    }

    public ly_0 a(lg lg2) {
        if (this.c == null) {
            this.n();
            this.b.add(lg2.G());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)lg2.G());
        }
        return this;
    }

    public ly_0 b(int n, lg lg2) {
        if (this.c == null) {
            this.n();
            this.b.add(n, lg2.G());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)lg2.G());
        }
        return this;
    }

    public ly_0 a(Iterable<? extends le_0> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public ly_0 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public ly_0 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public lg d(int n) {
        return (lg)this.o().getBuilder(n);
    }

    @Override
    public lp b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (lp)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends lp> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public lg k() {
        return (lg)this.o().addBuilder((AbstractMessage)le_0.H());
    }

    public lg e(int n) {
        return (lg)this.o().addBuilder(n, (AbstractMessage)le_0.H());
    }

    public List<lg> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<le_0, lg, lp> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final ly_0 a(UnknownFieldSet unknownFieldSet) {
        return (ly_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ly_0 b(UnknownFieldSet unknownFieldSet) {
        return (ly_0)super.mergeUnknownFields(unknownFieldSet);
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

