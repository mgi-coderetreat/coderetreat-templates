// https://xunit.net/docs/getting-started/netcore/cmdline#write-first-tests

using System;
using Xunit;

namespace Program.Tests
{
    public class Tests
    {
        [Fact]
        public void ShouldGreet()
        {
            Assert.Equal("Hello", Program.Greet());
        }
    }
}
