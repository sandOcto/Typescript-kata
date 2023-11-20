import { defineConfig } from 'vitest/config'

export default defineConfig({
  test: {
    coverage: {
      provider: 'istanbul',
      skipFull: true,
    },
    environment: 'node',
    globals: true,
    logHeapUsage: true,
    sequence: {
      concurrent: true,
      shuffle: true
    },
    include: ['tests/*.test.ts'],
  },
})
