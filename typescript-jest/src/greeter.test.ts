import {describe, it, expect, test} from '@jest/globals';

import {greet} from './greeter'

// "test" style
test('Greeter should greet', () => {
  expect(greet()).toBe("Hello")
}) 

// "spec" style
describe('Greeter', () => {
    it('should greet', () => {
        expect(greet()).toBe("Hello")
    })
})
