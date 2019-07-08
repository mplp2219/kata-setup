using System;
using Xunit;

namespace test
{
    public class MarsRoverTest
    {

        static string North = "N";
        static int[] AnyPosition = { 1, 2 };

        // input 
        /// initialpos: [x, y]
        /// initialdirection: 'E' | 'N' | 'W' | 'S'
        /// commands list "fbrl"

        // output 
        /// currentpos: [x1, y1]
        /// currentdir: 'N' 
        /// OR BLOCKED

        [Fact]
        public void InAbsenceOfCommandsTheCurrentStateIsTheInitialState()
        {
            var initialDirection = North;
            int[] initialPosition = AnyPosition;

            string currentDirection = initialDirection;
            int[] currentPosition = initialPosition;

            Assert.Equal(initialDirection, currentDirection);
            Assert.Equal(initialPosition, currentPosition);

            // 1.
            // at the moment no public boundary, so no problem using string
            // at the moment this is readable

            // 2.
            // There is a concept lurking in "state", what is it?
        }

        [Fact]
        public void MoveOneStepForward()
        {
            var initialDirection = North;
            int[] initialPosition = { 1, 2 };

            string currentDirection = initialDirection;
            const int deltaNorth = 1;
            int[] currentPosition = { initialPosition[0], initialPosition[1] + deltaNorth };

            Assert.Equal(initialDirection, currentDirection);
            Assert.Equal(new int[] { 1, 3 }, currentPosition);
        }

    }
}